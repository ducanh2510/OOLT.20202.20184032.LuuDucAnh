package hust.soict.hedspi.aims.media;

public class Disc extends Media{
    protected int length;
    protected String directory;

    public Disc(int length, String directory) {
        this.length = length;
        this.directory = directory;
    }

    public Disc(String title, String category, float cost, int length, String directory) {
        super(title, category, cost);
        this.length = length;
        this.directory = directory;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "length=" + length +
                ", directory='" + directory + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Disc() {
    }



}