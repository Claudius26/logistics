package com.logistics.data.model;

import lombok.Data;

@Data
public class Order {
    private String id;
    private String packge;
    private String customerId;
    private boolean isAvailable = true;
    private boolean isPicked = false;
    private PackageStatus status = PackageStatus.PENDING;
}
