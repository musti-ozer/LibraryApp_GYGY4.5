package com.turkcell.libraryapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping
    public String getAllBooks(@RequestParam(required = false) String title,
                              @RequestParam(required = false) String author) {
        return "Kitaplar listelendi. Filtre: title=" + title + ", author=" + author;
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Long id) {
        return "Kitap getirildi: ID = " + id;
    }

    @PostMapping
    public String addBook(@RequestBody String bookJson) {
        return "Yeni kitap eklendi: " + bookJson;
    }

    @PatchMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody String updatedBook) {
        return "Kitap güncellendi: ID = " + id + ", Bilgi = " + updatedBook;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return "Kitap silindi: ID = " + id;
    }
}