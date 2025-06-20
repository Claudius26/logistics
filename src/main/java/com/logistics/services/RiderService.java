package com.logistics.services;

import com.logistics.dtos.Requests.LoginRequest;
import com.logistics.dtos.Requests.LogoutRequest;
import com.logistics.dtos.Requests.UserRequest;
import com.logistics.dtos.Responses.LoginResponse;
import com.logistics.dtos.Responses.LogoutResponse;
import com.logistics.dtos.Responses.UserResponse;

public class RiderService implements UserService{
    @Override
    public UserResponse registerUser(UserRequest request) {
        return null;
    }

    @Override
    public LoginResponse loginUser(LoginRequest request) {
        return null;
    }

    @Override
    public LogoutResponse logOut(LogoutRequest request) {
        return null;
    }
}
