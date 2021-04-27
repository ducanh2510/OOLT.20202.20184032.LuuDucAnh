package hust.soict.hedspi.aims.media;

public abstract class  Media {
	private String title;
	private String category;
	private float cost;
	
	
	public Media() {
	}
	
	public Media(String title) {
		this.title = title;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Media) {
			Media mdia = (Media) obj;
			return mdia.getTitle().equals(this.getTitle());
		}
		return false;
	}

	public Media(String title, String category) {

		this.title = title;
		this.category = category;
	}

	public Media(String title, String category, float cost) {

		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public float getCost() {
		return cost;
	}
	
	
	
}