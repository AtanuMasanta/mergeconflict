package com.merge.conflict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.merge.conflict.entity.Book;
import com.merge.conflict.repository.BookRepositoryService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/book")
public class BookController 
{
	@Autowired
	private BookRepositoryService bookService;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
	
	@GetMapping("/getBookById/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id")String id)
	{

		Book x= bookService.getBookById(id);
		return new ResponseEntity<>(x,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getMethodName() 
	{

		return bookService.getAllBook();
	}
	
	
	
}
