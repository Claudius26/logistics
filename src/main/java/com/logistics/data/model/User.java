package com.logistics.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {
    @Id
    protected String id;
    protected String fullname;
    protected String email;
    protected String password;
    protected String phone;
    protected UserType role;
}
