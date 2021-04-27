package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc implements Playable,Comparable {

	public DigitalVideoDisc(int length, String director) {
		super(length, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play DVD : "+this.getTitle());
		System.out.println("DVD lenght: "+ this.getLength());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof DigitalVideoDisc) {
			DigitalVideoDisc digitalVideoDisc = (DigitalVideoDisc) o;
			if(digitalVideoDisc.getCost() > this.getCost())
				return 1;
		}
		return 0;
	}
	

}