package com.logistics.data.model;

public class Customer extends User{
    public Customer(){
        this.role = UserType.CUSTOMER;
    }
}
