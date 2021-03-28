package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import java.util.Random;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order{
    private MyDate dateOrdered=new MyDate();
    public static final int MAX_NUMBERS_ORDERED = 10;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
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
    public void setQtyOrder(int qtyOrder){
    }
    public void addDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        if(itemsOrdered.size()<MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(digitalVideoDisc);
        }
        else {
            System.out.println("maximum "+MAX_NUMBERS_ORDERED+" products in 1 ordered");
        }
    }
    public void addDigitalVideoDisc(ArrayList<DigitalVideoDisc> digitalVideoDiscs){
        if(MAX_NUMBERS_ORDERED>digitalVideoDiscs.size()){
            for (DigitalVideoDisc x:digitalVideoDiscs) {
                itemsOrdered.add(x);
            }
        } else{
            for(int i=0;i<MAX_NUMBERS_ORDERED;i++){
                itemsOrdered.add(digitalVideoDiscs.get(i));
            }
            System.out.println("the dvd(s) that could not be added:");
            for(int i=MAX_NUMBERS_ORDERED;i< digitalVideoDiscs.size();i++){
                System.out.println(digitalVideoDiscs.get(i).toString());
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        itemsOrdered.remove(digitalVideoDisc);
    }
    public float totalCost(){
        float total=0;
        for(DigitalVideoDisc x: itemsOrdered){
            total+=x.getCost();
        }
        return total;
    }
    public void printOrdered(){
        for (DigitalVideoDisc x: itemsOrdered){
            System.out.println(x.toString());
        }
    }
    public DigitalVideoDisc getALuckyItem(){
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