package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order{
    private MyDate dateOrdered=new MyDate();
    private List<Media> itemsOrdered = new ArrayList<>();
    public Order(){
    }
    public MyDate getDateOrdered() {
        return dateOrdered;
    }
    public void setDateOrdered(MyDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public int getQtyOrder(){
        return itemsOrdered.size();
    }
    
    public void addMedia(Media media){
       itemsOrdered.add(media);
    }
    public void addMedia(ArrayList<Media> medias){
        for(Media media: medias) { 
        	itemsOrdered.add(media);
        }
    }
    
    public void removeMedia(int id) {
    	itemsOrdered.remove(id);
    }
    
    public void removeMedia(Media media){
        itemsOrdered.remove(media);
    }
    public float totalCost(){
        float total=0;
        for(Media x: itemsOrdered){
            total+=x.getCost();
        }
        return total;
    }
    public void printOrdered(){
        for (Media x: itemsOrdered){
            System.out.println(x.toString());
        }
    }
    public Media getALuckyItem(){
        int total= itemsOrdered.size();
        int luckynumber;
        Random rd= new Random();
        luckynumber=rd.nextInt(total);
        for(int i=0;i<itemsOrdered.size();i++){
            if(i==luckynumber){
                itemsOrdered.get(i).setCost(0);
                break;
            }
        }
        return itemsOrdered.get(luckynumber);
    }

}