package My_Date;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate() {
        Calendar c = Calendar.getInstance();
        this.day = c.get(Calendar.DATE);
        this.month = c.get(Calendar.MONTH)+1;
        this.year = c.get(Calendar.YEAR);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date){
        if(!accept(date)){
            this.day= 0;
            this.month = 0;
            this.year = 0;
            System.out.println("Input invalid!!");
        };
    }

    public int checkMonth(String month){
        if(month.equalsIgnoreCase("January")==true){
            return 1;
        }
        if(month.equalsIgnoreCase("February")==true){
            return 2;
        }
        if(month.equalsIgnoreCase("March")==true){
            return 3;
        }
        if(month.equalsIgnoreCase("April")==true){
            return 4;
        }
        if(month.equalsIgnoreCase("May")==true){
            return 5;
        }
        if(month.equalsIgnoreCase("June")==true){
            return 6;
        }
        if(month.equalsIgnoreCase("July")==true){
            return 7;
        }
        if(month.equalsIgnoreCase("August")==true){
            return 8;
        }
        if(month.equalsIgnoreCase("September")==true){
            return 9;
        }
        if(month.equalsIgnoreCase("October")==true){
            return 10;
        }
        if(month.equalsIgnoreCase("November")==true){
            return 11;
        }
        if(month.equalsIgnoreCase("December")==true){
            return 12;
        }

        else return 0;
    }
    public boolean accept(String date){
        int year,month,day;
        String words[] = date.split("\\s");

        if(words.length>3||checkMonth(words[0])==0||words[1].length()>=5) return false;

        try {
                year = Integer.parseInt(words[2]);

                month = checkMonth(words[0]);
                if(month == 0) return false;

                if(words[1].length()==3){
                    day = Integer.parseInt(words[1].substring(0,1));
                }else if (words[1].length()==4){
                    day = Integer.parseInt(words[1].substring(0,2));
                } else return false;
                if(day<=0) return false;

            }catch (Exception e){
                return false;
                }

        this.day = day;
        this.month = month;
        this.year = year;
        return true;

    }
    public void print(){
        System.out.println( "This date " +
                "day=" + day +
                ", month=" + month +
                ", year=" + year);
    }
}
