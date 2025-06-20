package com.logistics.data.repositories;
import com.logistics.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogisticUsers extends MongoRepository<User,String> {
}
