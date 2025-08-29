package com.turkcell.libraryapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @PostMapping("/{bookId}")
    public String borrowBook(@PathVariable Long bookId) {
        return "Kitap ödünç alındı: ID = " + bookId;
    }

    @GetMapping("/me")
    public String getMyBorrowedBooks() {
        return "Öğrencinin ödünç aldığı kitaplar listelendi (dummy)";
    }

    @PostMapping("/return/{bookId}")
    public String returnBook(@PathVariable Long bookId) {
        return "Kitap iade edildi: ID = " + bookId;
    }
}