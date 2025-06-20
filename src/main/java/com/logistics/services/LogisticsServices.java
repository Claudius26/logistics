package com.logistics.services;

import com.logistics.data.model.Customer;
import com.logistics.data.model.User;
import com.logistics.dtos.Responses.RiderResponse;

import java.util.List;

public interface LogisticsServices {
    List<RiderResponse> findAllAvailableRiders(User user);
    //OrderResponse sendOrder(OrderRequest request);
}
