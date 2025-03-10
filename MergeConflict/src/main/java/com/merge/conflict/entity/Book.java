package com.merge.conflict.entity;

public class Book {
	
	String id;
	String name;
	String authorname;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String id, String name, String authorname) {
		super();
		this.id = id;
		this.name = name;
		this.authorname = authorname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorname=" + authorname + "]";
	}
	
	

}
