package media;
public class Track implements Playable,Comparable{
	private String title;
	private  int leght;
	public String getTitle() {
		return title;
	}
	public int getLeght() {
		return leght;
	}
	public Track(String title, int leght) {
		super();
		this.title = title;
		this.leght = leght;
	}
	public Track(String string) {
		// TODO Auto-generated constructor stub
		this.title = string;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Track) {
			Track track = (Track) obj;
			return track.leght == this.leght && track.getTitle().equals(this.getTitle());
		}
		return false;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}