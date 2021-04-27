package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;

public class Aims {
	static Scanner sc = new Scanner(System.in);
	static int  solanthemOders = -1;
	public static void main(String[] args) {
		showMenu();
		List<Order> list = new ArrayList<>();
		int luachon = sc.nextInt();
		sc.nextLine();
		while(luachon != 4) {
			switch (luachon){
			case 1:
				Order od = Order.createOder();
				if(od!=null)
					list.add(od);
				break;
			case 2:
				if(list.size()>0) {
				System.out.println("Ban chon loai nao: ");
				System.out.println("1.Book\n2.CompactDisc\n3.DigitalVideoDisc");
				int luachonloai = sc.nextInt();
				sc.nextLine();
				switch(luachonloai) {
					case 1 :
						System.out.println("Nhap title:");					
						String title = sc.nextLine();
						Book book = new Book(title);
						System.out.println(title);
						System.out.println(""+Order.nbOrders+ " "+ list.size());
						list.get(Order.nbOrders-1).addMedia(book);
						System.out.println("OK22222E");
						break;
					case 2:
						CompactDisc cpDisc = new CompactDisc(10, null);
						Track track = new Track("title cpDisc",10);
						cpDisc.addTrack(track);
						System.out.println("Da them!");
						list.get(Order.nbOrders-1).addMedia(cpDisc);
						System.out.println("DOne");
						break;
					case 3 :
						DigitalVideoDisc digit = new DigitalVideoDisc(10,"Directordigit");
						System.out.println("Da them!");
						list.get(Order.nbOrders-1).addMedia(digit);
						System.out.println("DOne");
						break;
					}
				}
				break;
			case 3:
				list.get(Order.nbOrders-1).showOrder();
				break;
				
			}
			showMenu();
			luachon = sc.nextInt();
			sc.nextLine();
		}
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	public static void xoaid(int id) {
		
	}
}