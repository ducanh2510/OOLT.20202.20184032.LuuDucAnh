package hust.soict.hedspi.aims.media;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<>();
	
//	public Book(String title) {
//		super(title);
//		authors = new ArrayList<>();
//	}
//	
//	public Book(String title, String category) {
//		super();
//		authors = new ArrayList<>();
//	}
	
	public Book() {
		super();
		inputInfoBook();
	}
	
	public void inputInfoBook() {
		List<String> authorList = new ArrayList<>();
		System.out.print("Moi nhap so tac gia: ");
		int countAuthors = scanner.nextInt();
		for(int i = 1; i <= countAuthors; i++) {
			System.out.print("Moi ban nhap author: ");
			String author = new Scanner(System.in).nextLine();
			authorList.add(author);
		}
		setAuthors(authorList);
	}
	
	public void addAuthor(String authorName) {
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	@Override
	public String toString() {
		String result = "Authors: ";
		for(String author: authors) {
			result += "-" + author;
		}
		result += super.toString();
		return result;
	}
	
}
