package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.LoginDto;
import com.example.apispringvuejs.Entity.User;
import com.example.apispringvuejs.Repository.UserRepository;
import com.example.apispringvuejs.Service.UserService;
import com.example.apispringvuejs.payloadreponse.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public LoginMessage loginUser(LoginDto loginDto) {
        Optional<User> optionalUser = this.userRepository.findByEmail(loginDto.getEmail());
        if(optionalUser.isPresent()){
            Optional<User>  optionalPassword = this.userRepository.findByEmail(loginDto.getEmail());
            User user = optionalUser.get();
//            String password = user.getPassword();
//            if(user.getPassword().equals(loginDto.getPassword())){
            if(passwordEncoder.matches(loginDto.getPassword(),user.getPassword())){
                return new LoginMessage("Đăng nhập thành công  ", true, user.getUsername(), user.getId());
            }else {
                return new LoginMessage("Đăng nhập thất bại",false, null,null);
            }
        }else {
            return new LoginMessage("Email không tìm thấy",false, null, null);
        }
    }
}
