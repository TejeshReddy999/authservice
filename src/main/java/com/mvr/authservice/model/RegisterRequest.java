package com.mvr.authservice.model;

import lombok.Data;

@Data
public class RegisterRequest {
    private  String userName;
    private  String password;
}
