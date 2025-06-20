package com.logistics.data.repositories;
import com.logistics.data.model.User;
import com.logistics.data.model.UserType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LogisticUsers extends MongoRepository<User,String> {
    List<User> findByRole(UserType role);
}
