package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getBooks() {
        return Arrays.asList(new Book(123423, "Prabhakaran Chinnathambi", "How to train your dragon"));
    }
}
