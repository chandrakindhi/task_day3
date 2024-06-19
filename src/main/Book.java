package main;

import java.util.Objects;

public class Book {

	int bookId;
	
	String title;
	String Author;
	Boolean isAvaliable;
	
	public Book(int bookId, String title, String author, Boolean isAvaliable) {
		super();
		this.bookId = bookId;
		this.title = title;
		Author = author;
		this.isAvaliable = isAvaliable;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Boolean getIsAvaliable() {
		return isAvaliable;
	}

	public void setIsAvaliable(Boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", Author=" + Author + ", isAvaliable=" + isAvaliable
				+ "]";
	}
	
	
	
}
