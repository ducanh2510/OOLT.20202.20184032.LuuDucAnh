package projectDisc;
import hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {
	int length;
	String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}
	
	
	
}