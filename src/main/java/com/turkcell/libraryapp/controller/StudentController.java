package com.turkcell.libraryapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public String getAllStudents() {
        return "Tüm öğrenciler listelendi (dummy)";
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable Long id) {
        return "Öğrenci bilgisi getirildi: ID = " + id;
    }

    @PatchMapping("/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody String updatedInfo) {
        return "Öğrenci güncellendi: ID = " + id + ", Bilgi = " + updatedInfo;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return "Öğrenci silindi: ID = " + id;
    }
}