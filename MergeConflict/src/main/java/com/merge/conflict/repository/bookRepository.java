package com.merge.conflict.repository;

import com.merge.conflict.entity.Book;
import java.util.*;
public interface bookRepository {
	
	public Book addBook(Book b);
	
	public Book getBookById(String id);
	
	public List<Book> getAllBook();

}
