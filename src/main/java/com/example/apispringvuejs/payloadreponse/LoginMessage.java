package com.example.apispringvuejs.payloadreponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginMessage {
    String message;
    Boolean status;
    private String name;
    private Long id;
    public String getMessage(){return message;}

    public void setMessage(String message){this.message = message;}

    public Boolean getStatus(){return status;}

    public void setStatus(Boolean status){this.status = status;}

    @Override
    public String toString() {
        return "LoginMessage{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
