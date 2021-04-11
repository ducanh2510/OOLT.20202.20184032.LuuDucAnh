package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(int length, String directory) {
        super(length, directory);
    }

    public DigitalVideoDisc() {
        super();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
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

    public boolean search(String title) {
        String splitTitle[];
        String test[] = this.title.split(" ");
        splitTitle = title.split(" ");
        int count = 0;
        for (String x : test) {
            for (String y : splitTitle) {
                if (x.equalsIgnoreCase(y) == true) {
                    count++;
                    break;
                }
            }
        }
        if (count == test.length) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", length=" + length +
                ", directory='" + directory + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}