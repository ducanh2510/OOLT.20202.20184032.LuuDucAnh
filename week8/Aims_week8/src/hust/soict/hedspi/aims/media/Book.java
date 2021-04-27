package projectDisc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import hust.soict.hedspi.aims.media.Media;

public class Book extends Media implements Comparable {
	private List<String> authors = new ArrayList<String>();
	private String content;
	
	public Book(List<String> authors, String content) {
		super();
		this.authors = authors;
		this.content = content;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Book(List<String> author) {
		super();
		this.authors = author;
	}

	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	Book(String title,
			String category){
			super(title, category);
	}
	Book(String title,
			String category,
			List<String> authors){
			super(title, category);
			this.authors = authors;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<String> processContent() {
		List<String> liss = new ArrayList<>();
		String[] arr = this.content.split(" ");
		for(int i=0;i<arr.length ; i++) {
			liss.add(arr[i]);
		}
		Collections.sort(liss);
		return liss;
	}
	public int numberOfcontent() {
		String[] arr = this.content.split(" ");
		return arr.length;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book "+ this.getTitle() + "Co so tu vung "+this.numberOfcontent();
	}
	
	
}