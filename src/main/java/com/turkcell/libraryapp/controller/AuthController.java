package com.turkcell.libraryapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public String registerStudent(@RequestBody String studentJson) {
        return "Yeni öğrenci kaydı alındı: " + studentJson;
    }

    @PostMapping("/login")
    public String login(@RequestBody String loginInfo) {
        return "Login başarılı, token: dummy-token";
    }
}
