package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
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
	public static void main(String[] args) {
		Program program = new Program();
		Scanner scanner = new Scanner(System.in);
		showMenu();
		while(true) {
			System.out.print("Moi nhap lua chon: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				program.createNewOrder();
				System.out.println("Tao Order thanh cong!!!");
				break;
			case 2:
				program.addItemToOrder();
				System.out.println("Them item thanh cong!!!");
				break;
			case 3:
				program.deleteItemByID();
				System.out.println("Xoa thanh cong");
				break;
			case 4:
				program.displayItems();
				break;
			case 0:
				System.out.println("Thoat chuong trinh");
				return;
			default:
				break;
			}
		}
	}
}
