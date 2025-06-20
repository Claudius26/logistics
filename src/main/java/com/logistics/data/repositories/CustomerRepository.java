package com.logistics.data.repositories;

import com.logistics.data.model.Customer;
import com.logistics.data.model.User;
import com.logistics.data.model.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class CustomerRepository implements LogisticUsers {
    @Autowired
    private LogisticUsers logisticUsers;
    public User findCustomerByEmail(String email) {
        List<User> users = logisticUsers.findByEmail(email);
        for (User user : users) {
            if(user.getRole() == UserType.CUSTOMER){
                return user;
            }
        }
        return null;
    }
}
