package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtouser;
import com.example.apispringvuejs.Dto.LoginDto;
import com.example.apispringvuejs.payloadreponse.LoginMessage;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    LoginMessage LoginUser(LoginDto loginDto);
    boolean createUser(Dtouser dtouser);
    boolean updateUser(Dtouser dtouser);
    boolean deleteUser(Long id);
    Dtouser getUerByid(Long id);
}
