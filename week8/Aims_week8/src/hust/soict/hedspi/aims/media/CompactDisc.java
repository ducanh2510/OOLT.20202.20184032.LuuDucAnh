package projectDisc;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.Media;
import projectDisc.Disc;
import projectDisc.Playable;
import projectDisc.Track;

public class CompactDisc extends Disc implements Playable,Comparable{
	private String artist;
	private ArrayList<Track> arrlist = new ArrayList<>();

	public CompactDisc(int length, String director) {
		super(length, director);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Track> getArrlist() {
		return arrlist;
	}

	public CompactDisc(int length, String director, String artist, ArrayList<Track> arrlist) {
		super(length, director);
		this.artist = artist;
		this.arrlist = arrlist;
	}
	
	public void addTrack(Track tracktest) {
		int check =0 ;
		for(int i=0 ; i< arrlist.size() ; i++) {
			if(arrlist.get(i).getTitle().equals(tracktest.getTitle()) == true) {
				System.out.println("Track is exist");
				check +=1;
				break;
			}
		}
		if(check==0) {
			arrlist.add(tracktest);
		}
	}
	public void removeTrack(Track tracktest) {
		int check = 0;
		for(int i = 0 ;i< arrlist.size() ; i++)
		{
			if(arrlist.get(i).getTitle().equals(tracktest.getTitle()) == true)
				arrlist.remove(i);
			check+=1;
		}
		if(check == 0)
			System.out.println("Khong thay ket qua");
	}
	public int getLeght() {
		int tong=0;
		for(int i =0 ; i< arrlist.size() ; i++) {
			tong+=arrlist.get(i).getLeght();
		}
		return tong;
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o  instanceof CompactDisc) {
			CompactDisc cp = (CompactDisc) o;
			if(cp.getArrlist().size() > this.getArrlist().size()) {
				if(cp.getLeght() > this.getLeght()) {
					return 1;
				}
			}
		}
		return 0;
	}
	
}