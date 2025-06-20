package com.mvr.authservice.service;

import com.mvr.authservice.entity.ProfileUser;
import com.mvr.authservice.model.AuthResponse;
import com.mvr.authservice.model.LoginRequest;
import com.mvr.authservice.model.RegisterRequest;
import com.mvr.authservice.repository.UserRepository;
import com.mvr.authservice.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImp implements AuthService {


    private  final UserRepository userRepository;
    private  final  JwtUtil jwtUtil;
    private  final PasswordEncoder passwordEncoder;

    @Override
    public String register(RegisterRequest registerRequest) {
        if(userRepository.existsByUserName(registerRequest.getUserName())){
            throw  new RuntimeException("Username already exists");
        }

        ProfileUser user = ProfileUser.builder()
                .userName(registerRequest.getUserName())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role("USER").build();
        userRepository.save(user);
        return "User registered successfully";
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        ProfileUser user = userRepository.findByUserName(loginRequest.getUserName()).
                orElseThrow(()-> new RuntimeException("Invalid username or password"));

        if (!passwordEncoder.matches(loginRequest.getPassword(),user.getPassword()))
            throw new RuntimeException("Invalid username or password");

        String token =  jwtUtil.generateToken(user.getUserName());
        return new AuthResponse(token);
    }
}
