package com.logistics.data.repositories;

import com.logistics.data.model.Rider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Riders extends MongoRepository<Rider,String> {
}
