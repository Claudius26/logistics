package com.logistics.services;

import com.logistics.dtos.Requests.LoginRequest;
import com.logistics.dtos.Requests.LogoutRequest;
import com.logistics.dtos.Requests.UserRequest;
import com.logistics.dtos.Responses.LoginResponse;
import com.logistics.dtos.Responses.LogoutResponse;
import com.logistics.dtos.Responses.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse registerUser(UserRequest request);
    LoginResponse loginUser(LoginRequest request);
    LogoutResponse logOut(LogoutRequest request);
}
