package com.mvr.authservice.service;

import com.mvr.authservice.model.AuthResponse;
import com.mvr.authservice.model.LoginRequest;
import com.mvr.authservice.model.RegisterRequest;

public interface AuthService {
    String register(RegisterRequest registerRequest);
    AuthResponse login(LoginRequest loginRequest);
}
