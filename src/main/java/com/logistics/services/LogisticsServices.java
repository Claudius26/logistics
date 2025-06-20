package com.logistics.services;

import com.logistics.data.model.Customer;

public interface LogisticsServices {
    RiderResponse findRider(Customer customer);
    //OrderResponse sendOrder(OrderRequest request);
}
