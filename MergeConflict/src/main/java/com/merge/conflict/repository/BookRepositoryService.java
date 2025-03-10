package com.merge.conflict.repository;

import java.util.*;

import org.springframework.stereotype.Service;

import com.merge.conflict.entity.Book;

@Service
public class BookRepositoryService implements bookRepository
{
	static List<Book>list;
	static
	{
		list=new ArrayList<>();
		list.add(new Book("abc-123","learn java","atanu masanta"));
		list.add(new Book("xyz-123","learn python","subho masanta"));
		list.add(new Book("pqrs-123","learn dbms","ashok masanta"));
		
	}

	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

	public Book getBookById(String id) {
		
		for(Book b:list)
		{
			if(b.getId().equals(id))
			{
				return b;
			}
		}
		return null;
	}

	public List<Book> getAllBook() 
	{
		
		return list;
	}
	
	public String fun()
	{
		return "enjoyy";
	}
}
