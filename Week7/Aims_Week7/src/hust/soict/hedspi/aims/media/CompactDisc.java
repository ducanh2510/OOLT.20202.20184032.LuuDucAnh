package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc(){

    }
    public CompactDisc(int length, String directory) {
        super(length, directory);
    }
    public void addTrack(String title, int length){
        Track track = new Track(title,length);
        tracks.add(track);
    }
    public void removeTrack(String title,int length){
        Track track = new Track(title,length);
        tracks.remove(track);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void play() {
        for(Track x: tracks){
            System.out.println(x.toString());
        }
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "artist='" + artist + '\'' +
                ", tracks=" + tracks +
                ", length=" + length +
                ", directory='" + directory + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
}
