package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;

//    public DigitalVideoDisc(String title) {
//    	super(title);
//    }
//    
//    public DigitalVideoDisc(String title, String category) {
//    	super();
//    }
    
    public DigitalVideoDisc() {
    	super();
    	inputInfoDisc();
    }
    
    public void inputInfoDisc() {
    	System.out.print("Moi nhap directory: ");
    	String directory = scanner.nextLine();
    	this.director = directory;
    	System.out.print("Moi nhap length: ");
    	int length = scanner.nextInt();
    	this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public String toString() {
    	String result = "\nDirectory: " + director
    					+ "\nLength: " + length + super.toString();
    	return result;
    }

}