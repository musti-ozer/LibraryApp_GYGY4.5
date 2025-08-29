package com.turkcell.libraryapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/borrows")
    public String getAllBorrows() {
        return "Tüm ödünç hareketleri listelendi (dummy)";
    }

    @GetMapping("/stats")
    public String getStats() {
        return "{ \"toplamKitap\": 100, \"aktifOgrenci\": 50, \"odunctekiKitap\": 20 }";
    }
}