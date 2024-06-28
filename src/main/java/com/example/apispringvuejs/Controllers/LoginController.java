package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.LoginDto;
import com.example.apispringvuejs.Service.Impl.UserServiceImpl;
import com.example.apispringvuejs.Service.UserService;
import com.example.apispringvuejs.payloadreponse.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
@CrossOrigin("http://localhost:3000")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @ResponseBody
    public ResponseEntity<?> LoginUser(@RequestBody LoginDto loginDto){
        LoginMessage loginMessage = this.userService.LoginUser(loginDto);
        return ResponseEntity.ok(loginMessage);
    }

}
