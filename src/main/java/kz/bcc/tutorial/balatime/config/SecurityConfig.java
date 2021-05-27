package kz.bcc.tutorial.balatime.config;
//        import kz.iitu.springsecurityexample.service.impl.UserServiceImpl;
        import kz.bcc.tutorial.balatime.service.impl.adminUser.UserServiceImpl;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
        import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
        import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceImpl userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/auth/**").permitAll()
                .antMatchers("/api/private/v1/user/**").permitAll()
                .antMatchers("/api/private/v1/teacher/**").permitAll()
                .antMatchers("/api/private/v1/room/**").hasAuthority("TEACHER")
//                .antMatchers("/users/create").hasAuthority("ADMIN")
                .antMatchers("/v2/api-docs",
                        "/configuration/ui",
                        "/swagger-resources/**",
                        "/configuration/security",
                        "/swagger-ui.html",
                        "/swagger-ui/**",
                        "/webjars/**").permitAll()
                .anyRequest().authenticated()
                .and()
                // What's the authenticationManager()?
                // An object provided by WebSecurityConfigurerAdapter, used to authenticate the user passing user's credentials
                // The filter needs this auth manager to authenticate the user.
                .addFilter(new JwtTokenGeneratorFilter(authenticationManager()))

                // Add a filter to validate the tokens with every request
                .addFilterAfter(new JwtTokenAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public NonePasswordEnconder passwordEncoder() {
//        return new BCryptPasswordEncoder();
        return new NonePasswordEnconder();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(passwordEncoder());
    }
}
