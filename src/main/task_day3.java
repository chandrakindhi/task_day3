package main;

public class task_day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library library = new Library();
Book book1 = new Book( 1, " title1", "author 1", true);
Book book2 = new Book(2, " title2", "author 2", true);

Book book3 = new Book( 3, " title3", "author 3", true);
Book book4 = new Book(4, " title4", "author 4", true);

library.addBook(book1);
library.addBook(book2);
library.addBook(book3);
library.addBook(book4);

library.display();

library.removeBook(book3);
library.removeBook(book1);


library.display();

	}

}
