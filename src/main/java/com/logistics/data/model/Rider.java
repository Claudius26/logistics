package com.logistics.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Rider extends User {
    private boolean isAvailable;
    public Rider() {
        this.role = UserType.RIDER;
    }
}
