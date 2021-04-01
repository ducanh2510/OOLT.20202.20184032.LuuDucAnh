public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("Jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: "+cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: "+jungleDVD.getTitle());
        
    }
    public static void swap(DigitalVideoDisc O1,DigitalVideoDisc O2){
        String t=O1.getTitle();
        O1.setTitle(O2.getTitle());
        O2.setTitle(t);
    }
    public static void changeTitle(DigitalVideoDisc o1,String s){
        String oldtitle=o1.getTitle();
        o1.setTitle(s);
        o1=new DigitalVideoDisc(oldtitle);
    }
}
