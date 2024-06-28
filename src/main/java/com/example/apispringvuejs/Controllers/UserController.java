package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtouser;
import com.example.apispringvuejs.Entity.User;
import com.example.apispringvuejs.Service.Impl.UserServiceImpl;
import com.example.apispringvuejs.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    private ResponseEntity<List<Dtouser>> getAllUser(){
        List<Dtouser> dtouserList = this.userServiceImpl.getAllUser();
        if(dtouserList != null){
            return ResponseEntity.ok(dtouserList);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtouserList);
        }
    }
    @PostMapping("/add")
    @ResponseBody
    private ResponseEntity createUser (@RequestBody Dtouser dtouser){
        boolean isSuccess = this.userServiceImpl.createUser(dtouser);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    private ResponseEntity updateUser(@PathVariable Long id,@RequestBody Dtouser dtouser){
        dtouser.setId(id);
        boolean isSuccess = this.userServiceImpl.updateUser(dtouser);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    private ResponseEntity deleteUser(@PathVariable Long id){
        boolean isSuccess = this.userServiceImpl.deleteUser(id);
        System.out.println("Gọi Delete" + isSuccess);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
    @GetMapping("/user/{id}")
    @ResponseBody
    private ResponseEntity getUserId(@PathVariable Long id){
        Dtouser getUserId = this.userServiceImpl.getUerByid(id);
        if(getUserId != null){
            return ResponseEntity.ok(getUserId);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(getUserId);
        }
    }
}
