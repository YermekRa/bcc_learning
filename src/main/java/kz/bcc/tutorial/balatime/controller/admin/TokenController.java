package kz.bcc.tutorial.balatime.controller.admin;

import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/token", produces = APPLICATION_JSON_VALUE)
public class TokenController {
    @ApiOperation(value = "GET PRINCIPAL")
    @GetMapping("/current")
    public ResponseEntity<String> getCurrent1(Principal principal) {
        return ResponseEntity.ok(new Gson().toJson(principal));
    }


}
