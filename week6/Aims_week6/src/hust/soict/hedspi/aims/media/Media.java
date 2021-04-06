package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class Media {
	
	private String title;
    private String category;
    private float cost;
    protected Scanner scanner = new Scanner(System.in);
    
    
//	public Media(String title) { 
//		this.title = title;
//	}
	
	public Media() {
		inputInfo();
	}
	
	public void inputInfo() {
		System.out.print("Moi nhap title: ");
		String title = scanner.nextLine();
		this.title = title;
		System.out.print("Moi nhap category: ");
		String category = scanner.nextLine();
		this.category = category;
		System.out.print("Moi nhap cost: ");
		float cost = scanner.nextFloat();
		this.cost = cost;
		scanner.nextLine();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		String result = "\nTitle: " + title
					   + "\nCategory: " + category
					   + "\nCost: " + cost;
		
		return result;
	}
	
}
