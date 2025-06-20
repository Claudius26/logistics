package com.logistics.services;

import com.logistics.dtos.Requests.DeliveryRequest;
import com.logistics.dtos.Requests.LoginRequest;
import com.logistics.dtos.Requests.LogoutRequest;
import com.logistics.dtos.Requests.UserRequest;
import com.logistics.dtos.Responses.LoginResponse;
import com.logistics.dtos.Responses.LogoutResponse;
import com.logistics.dtos.Responses.UserResponse;

public interface RiderService{
    void acceptRequest(DeliveryRequest request);


}
