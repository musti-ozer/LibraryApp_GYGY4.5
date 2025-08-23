package com.turkcell.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @PostMapping("/register")
    public String register(@RequestParam() String username, @RequestParam() String password){
        return "Yeni öğrenci:"+ username+ " kaydedildi.";

    }

    @PostMapping("/login")
    public String login(@RequestParam() String username, @RequestParam() String password){
        return "Yeni öğrenci:"+ username+ " giriş yaptı.";

    }
}
