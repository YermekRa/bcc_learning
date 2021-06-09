package kz.bcc.tutorial.balatime.service.impl.adminUser;

import com.google.gson.Gson;

import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.repository.UserRepository;
import kz.bcc.tutorial.balatime.repository.pagination.UserRepositoryPaging;
import kz.bcc.tutorial.balatime.service.admin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepositoryPaging userRepositoryPaging;

    @Override
    public User create(User user) {
        System.out.println(new Gson().toJson(user));
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User getById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return userRepository.findById(id).get();
        } else {
            return null;
        }
    }


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.getUserByLogin(s);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

//    @Override
//    public CustomPagination getAllByPaginationProcIdOrTaskId(Map<String, String> allRequestParams) {
//        CustomPagination customPagination = new CustomPagination();
//        int pageNumber = 0;
//        int pageSize = 6;
//        boolean a;
//        if (allRequestParams.containsKey("page")) {
//            pageNumber = Integer.parseInt(allRequestParams.get("page"));
//        }
//        if (allRequestParams.containsKey("size")) {
//            pageSize = Integer.parseInt(allRequestParams.get("size"));
//        }
//        final Pageable pageableRequest = PageRequest.of(pageNumber, pageSize);
//        List<User> userList = userRepository.findAll(pageableRequest).toList();
////        customPagination.setList(userRepository.findAll(pageableRequest).getContent());
//        customPagination.setTotalSize(userList.size());
//        customPagination.setPage(pageNumber);
//        customPagination.setSize(pageSize);
//        return customPagination;
//    }

    @Override
    public Page<User> getAllByPageAndSize(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return userRepositoryPaging.findAll(pageable);
    }

}
