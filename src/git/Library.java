package git;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public Library() {
		// TODO Auto-generated constructor stub
	}

	private List<String> books = new ArrayList<>();

	public void addBook(String bookName) {
		books.add(bookName);
		System.out.println(bookName + " added to library.");
	}

	public void listBooks() {
		System.out.println("Books in library: " + books);
	}
	  public boolean searchBook(String bookName) {
	       return books.contains(bookName);
	   }

}
