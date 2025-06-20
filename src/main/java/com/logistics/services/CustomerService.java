package com.logistics.services;


import com.logistics.dtos.Responses.RiderResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    List<RiderResponse> findAvailableRider();
}
