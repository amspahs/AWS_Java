package test;

import manager.Book;

public class BookManager {
	public static void main(String[] args) {
		
	Book bk = new Book();
	
	bk.setName("어린왕자");
	bk.setAuthor("생택쥐페리");
	bk.setPublisher("비룡소");
	bk.setPrice(9500);
	bk.setAuthorDate("2000.05.23");
	
	String name = "";
	String author = "";
	String publisher = "";
	int price = 0;
	String authorDate = "";
	
	name = bk.getName();
	author = bk.getAuthor();
	publisher = bk.getPublisher();
	price = bk.getPrice();
	authorDate = bk.getAuthorDate();
	
	System.out.println(bk);
	
	}
}
