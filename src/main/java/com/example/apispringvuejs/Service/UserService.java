package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.LoginDto;
import com.example.apispringvuejs.payloadreponse.LoginMessage;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    LoginMessage loginUser(LoginDto loginDto);

}
