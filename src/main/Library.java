package main;

import java.util.ArrayList;

public class Library {

	ArrayList<Book> bookStore;

	public Library() {
		super();
		bookStore =new ArrayList();
		
	}
	
	public void  addBook(Book book) {
		this.bookStore.add(book);
	}

	public Boolean  removeBook(Book book) {
		if (this.bookStore.contains(book) == true) {
			int i = this.bookStore.indexOf(book);
			this.bookStore.remove(i);
			return true;
		}
		return false;
	}
	
	
	public void display() {
		System.out.println(this.bookStore);
	}
	
}
