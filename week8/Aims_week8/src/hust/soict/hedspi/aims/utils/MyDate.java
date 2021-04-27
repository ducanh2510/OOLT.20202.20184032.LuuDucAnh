package hust.soict.hedspi.aims.utils;

import java.util.Scanner;

public class MyDate {
	static Scanner sc = new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	public MyDate() {
		super();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void acept() {
		System.out.println("Nhap ngay");
		this.setDay(Integer.parseInt(sc.next()));
		System.out.println("Nhap thang");
		this.setMonth(Integer.parseInt(sc.next()));
		System.out.println("Nhap nam");
		this.setYear(Integer.parseInt(sc.next()));
	}
	public void print(){
		System.out.println(""+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		MyDate.sc = sc;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}