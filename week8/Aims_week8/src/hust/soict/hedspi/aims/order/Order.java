package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import java.util.Random;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order{
	public static final int MAX_NUMBERS_ORDERD = 10;
	//private DigitalVideoDisc items[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERD];
//	private int qty=0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered;
	public static final int MAX_LIMIT_ORDERED = 5;
	public static int nbOrders=0 ;
	public static void main(String[] args) {

	}
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	public void removeMedia(Media media) {
		for(int i=0;i<itemsOrdered.size();i++) {
			if(itemsOrdered.get(i).getTitle().equals(media.getTitle()) == true ) {
				itemsOrdered.remove(i);
			}
		}
	}
	public Order() {
		if(nbOrders < MAX_LIMIT_ORDERED)
			nbOrders++;
		else {
			System.out.println("Khong the them Order");
		}
	}
	public static  Order createOder() {
		if(nbOrders >= MAX_LIMIT_ORDERED)
			return null;
		else {
			Order oder = new Order();
			System.out.println(Order.nbOrders);
			return oder;
		}
	}

	public float totalcost() {
		float tong =0;
		for(int i = 0 ; i< itemsOrdered.size();i++) {
			tong += this.itemsOrdered.get(i).getCost();
		}
		return tong;
	}
	public void showOrder() {
		System.out.println("Day la so luong san pham");
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println("" + this.itemsOrdered.get(i).getTitle());
		}
	}

}