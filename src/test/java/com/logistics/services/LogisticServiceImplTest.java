package com.logistics.services;

import com.logistics.data.model.Customer;
import com.logistics.data.model.Rider;
import com.logistics.data.model.User;
import com.logistics.data.repositories.CustomerRepository;
import com.logistics.data.repositories.LogisticUsers;
import com.logistics.data.repositories.Riders;
import com.logistics.dtos.Requests.UserRequest;
import com.logistics.dtos.Responses.RiderResponse;
import com.logistics.dtos.Responses.UserResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LogisticServiceImplTest {
    @Autowired
    private UserService userService;

    @Autowired
    private LogisticUsers logisticUsers;

    @Autowired
    private CustomerRepository customer;

    @Test
    public void customerCanFindAvailableRidersTest() {
        userService.registerUser(registerRider());
        UserResponse response = userService.registerUser(registerCustomer());
        userService.registerUser(registerRider());
        userService.registerUser(registerRider());

        User user = customer.findCustomerByEmail(response.getEmail());




    }

    private UserResponse registerUser(UserRequest userRequest) {
        return userService.registerUser(userRequest);

    }
    private UserRequest registerCustomer() {
        UserRequest userRequest = new UserRequest();
        userRequest.setFirstname("Firstname");
        userRequest.setLastname("Lastname");
        userRequest.setEmail("email@email.com");
        userRequest.setPassword("password");
        userRequest.setPhone("123456789");
        userRequest.setRole("customer");
        return userRequest;

    }

    private UserRequest registerRider() {
        UserRequest userRequest = new UserRequest();
        userRequest.setFirstname("Firstname");
        userRequest.setLastname("Lastname");
        userRequest.setEmail("email@email.com");
        userRequest.setPassword("password");
        userRequest.setPhone("123456789");
        userRequest.setRole("rider");
        return userRequest;
    }
}