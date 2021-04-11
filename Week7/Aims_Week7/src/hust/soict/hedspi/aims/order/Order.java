package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    public static final int MAX_NUMBERS_ORDERED = 10;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public Order() {
    }

    public Media addMedia() {
        int choose;
        Media media = new Media() {
        };
        System.out.print("You want to add book or dvd (book enter 1,dvd enter 2,cd enter 3): ");
        choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                Book book = new Book();
                System.out.print("Title: ");
                book.setTitle(sc.nextLine());
                System.out.print("Catelogy: ");
                book.setCategory(sc.nextLine());
                System.out.print("Cost: ");
                book.setCost(sc.nextFloat());
                System.out.print("how many authors:");
                int ath = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= ath; i++) {
                    System.out.print("Author " + i + ": ");
                    book.addAuthor(sc.nextLine());
                }
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 1) {
                        itemsOrdered.add(book);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                return book;
            case 2:
                DigitalVideoDisc dvd = new DigitalVideoDisc();
                System.out.print("Title: ");
                dvd.setTitle(sc.nextLine());
                System.out.print("Catelogy: ");
                dvd.setCategory(sc.nextLine());
                System.out.print("Director: ");
                dvd.setDirectory(sc.nextLine());
                System.out.print("Length: ");
                dvd.setLength(sc.nextInt());
                System.out.print("Cost:");
                dvd.setCost(sc.nextFloat());
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 2) {
                        itemsOrdered.add(dvd);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                System.out.println("you want to play DVD(enter 1 to play): ");
                int choose2 = 0;
                choose2 = sc.nextInt();
                switch (choose2) {
                    case 1:
                        dvd.play();
                        break;
                    default:
                        break;
                }
                return dvd;
            case 3:
                CompactDisc compactDisc = new CompactDisc();
                System.out.print("Title: ");
                compactDisc.setTitle(sc.nextLine());
                System.out.print("Catelogy: ");
                compactDisc.setCategory(sc.nextLine());
                System.out.print("Director: ");
                compactDisc.setDirectory(sc.nextLine());
                System.out.print("Length: ");
                compactDisc.setLength(sc.nextInt());
                System.out.print("Cost: ");
                compactDisc.setCost(sc.nextFloat());
                System.out.print("Artist: ");
                sc.nextLine();
                compactDisc.setArtist(sc.nextLine());
                System.out.print("How many Track? ");
                int track = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= track; i++) {
                    System.out.print("Title of track "+i+":");
                    String titleTrack= sc.nextLine();
                    System.out.print("Length of track "+i+":");
                    int lengthTrack=sc.nextInt();
                    compactDisc.addTrack(titleTrack,lengthTrack);
                    sc.nextLine();
                }
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 3) {
                        itemsOrdered.add(compactDisc);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                System.out.println("you want to play CD(enter 1 to play): ");
                int choose3 = 0;
                choose3 = sc.nextInt();
                switch (choose3) {
                    case 1:
                        compactDisc.play();
                        break;
                    default:
                        break;
                }
                return compactDisc;
            default:
                System.out.println("Input error");
                break;
        }
        return media;
    }

    public void addMedia(ArrayList<Media> medias) {
        if (MAX_NUMBERS_ORDERED > medias.size()) {
            for (Media x : medias) {
                itemsOrdered.add(x);
            }
        } else {
            for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
                itemsOrdered.add(medias.get(i));
            }
            System.out.println("the dvd(s) that could not be added:");
            for (int i = MAX_NUMBERS_ORDERED; i < medias.size(); i++) {
                System.out.println(medias.get(i).toString());
            }
        }
    }

    public void removeMedia() {
        String title;
        if (itemsOrdered.size() == 0) {
            System.out.println("Order empty!");
            return;
        }
        System.out.print("Enter the name of meia you want to delete: ");
        title = sc.nextLine();
        int j=0;
        for (int i=0;i<itemsOrdered.size();i++) {
            if (title.equals(itemsOrdered.get(i).getTitle())) {
                itemsOrdered.remove(i);
                j++;
            }
        }
        if(j>0){
            System.out.println("Delete finish");
        }
    }
    public int sizeofitemOrder(){
        return itemsOrdered.size();
    }

    public void printOrdered() {
        for (Media x : itemsOrdered) {
            System.out.println(x.toString());
        }
    }

    public Media getALuckyItem() {
        int total = itemsOrdered.size();
        int luckynumber;
        Random rd = new Random();
        luckynumber = rd.nextInt(total);
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (i == luckynumber) {
                itemsOrdered.get(i).setCost(0);
                break;
            }
        }
        return itemsOrdered.get(luckynumber);
    }

}
