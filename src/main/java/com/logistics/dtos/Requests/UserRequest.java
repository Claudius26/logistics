package com.logistics.dtos.Requests;

import com.logistics.data.model.UserType;
import lombok.Data;

@Data
public class UserRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private String role;
}
