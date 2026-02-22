package com.nailbook.nailbook_api.controller;

import com.nailbook.nailbook_api.model.entity.User;
import com.nailbook.nailbook_api.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return authService.login(user.getEmail(), user.getPassword());
    }

    @GetMapping("/secure")
    public String secure() {
        return "Rota protegida!";
    }
}
