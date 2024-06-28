package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtouser;
import com.example.apispringvuejs.Dto.LoginDto;
import com.example.apispringvuejs.Entity.User;
import com.example.apispringvuejs.Mapper.MapperUser;
import com.example.apispringvuejs.Repository.UserRepository;
import com.example.apispringvuejs.Service.UserService;
import com.example.apispringvuejs.payloadreponse.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    private UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public LoginMessage LoginUser(LoginDto loginDto) {
        Optional<User> optionalUser = this.userRepository.findByEmail(loginDto.getEmail());
        if(optionalUser.isPresent()){
//            Optional<User>  optionalPassword = this.userRepository.findByEmail(loginDto.getEmail());
            User user = optionalUser.get();
            String passwordEncode = user.getPassword();
            if(user.getPassword().equals(loginDto.getPassword())){
//            if(passwordEncoder.matches(loginDto.getPassword(),passwordEncode)){
                return new LoginMessage("Đăng nhập thành công  ", true, user.getUsername(), user.getId());
            }else {
                return new LoginMessage("Đăng nhập thất bại",false, null,null);
            }
        }else {
            return new LoginMessage("Email không tìm thấy",false, null, null);
        }
    }

    @Override
    public boolean createUser(Dtouser dtouser) {
        User user = MapperUser.MapUser(dtouser);
        user.setPassword(passwordEncoder.encode(dtouser.getPassword()));
        userRepository.save(user);
        return false;
    }

    @Override
    public boolean updateUser(Dtouser dtouser) {
        Optional<User> optionalUser = this.userRepository.findById(dtouser.getId());
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setUsername(dtouser.getUsername());
            user.setEmail(dtouser.getEmail());
            user.setPassword(dtouser.getPassword());
            user.setCreateAt(dtouser.getCreateAt());
            user.setUpdateAt(dtouser.getUpdateAt());
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(Long id) {
        Optional<User> DeleteUser = this.userRepository.findById(id);
        if(DeleteUser.isPresent()){
            userRepository.delete(DeleteUser.get());
            return true;
        }
        return false;
    }

    @Override
    public Dtouser getUerByid(Long id) {
        Optional<User> getUserById = this.userRepository.findById(id);
        if(getUserById.isPresent()){
            User user = getUserById.get();
            return MapperUser.MapToUserDto(user);
        }else {
            return null;
        }
    }
    public List<Dtouser> getAllUser(){
        List<Dtouser> dtouserList = this.userRepository.findAll()
                .stream().map(MapperUser::MapToUserDto)
                .collect(Collectors.toList());
        return dtouserList;
    }


}
