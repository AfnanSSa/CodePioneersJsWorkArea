package com.tracodepioneersapps.todo_list_app.controllers;

import com.tracodepioneersapps.todo_list_app.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/booklist")
public class BookListController {
    public CopyOnWriteArrayList<Book> book = new CopyOnWriteArrayList<>();

    @PostMapping
    public Book addBookToList(@RequestBody Book addedBook){
        book.add(addedBook);
        return addedBook;
    }

    @GetMapping
    public List<Book> getBookList(){
        return book;
    }
}
