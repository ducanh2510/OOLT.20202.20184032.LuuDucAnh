
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private String extensionDay = null;
    String[] validMonths = {"January", "February", "March", "April", "May","July", "June",
                         "August", "September", "October", "November", "December"};
    public int convertWord(String inputWord) {
        switch(inputWord) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
            case "eleven":
                return 11;
            case "twelve":
                return 12;
            case "thirteen":
                return 13;
            case "fourteen":
                return 14;
            case "fifteen":
                return 15;
            case "sixteen":
                return 16;
            case "seventeen":
                return 17;
            case "eighteen":
                return 18;
            case "nineteen":
                return 19;
            case "twenty":
                return 20;
            case "thirty":
                return 30;
            case "forty":
                return 40;
            case "fifty":
                return 50;
            case "sixty":
                return 60;
            case "seventy":
                return 70;
            case "eighty":
                return 80;
            case "ninety":
                return 90;
            case "hundred":
                return 100;
            case "thousand":
                return 1000;
            case "and":
                return 0;
            default:
                return -1;
        }
    }
    public int convertMonth(String inputMonth) {
        for(int i = 0; i < validMonths.length; i++) {
            if(inputMonth == validMonths[i]) {
                return i + 1;
            }
        }
        return 0;
    }
    public int convertDay(String inputDay) {
        switch(inputDay) {
            case "first":
                return 1;
            case "second":
                return 2;
            case "third":
                return 3;
            case "fourth":
                return 4;
            case "fifth":
                return 5;
            case "sixth":
                return 6;
            case "seventh":
                return 7;
            case "eighth":
                return 8;
            case "nineth":
                return 9;
            case "tenth":
                return 10;
            case "eleventh":
                return 11;
            case "twelfth":
                return 12;
            case "thirdteenth":
                return 13;
            case "fourteenth":
                return 14;
            case "fifteenth":
                return 15;
            case "sixteenth":
                return 16;
            case "seventeenth":
                return 17;
            case "eightteenth":
                return 18;
            case "nineteenth":
                return 19;
            case "twentieth":
                return 20;
            case "twenty first":
                return 21;
            case "twenty second":
                return 22;
            case "twenty third":
                return 23;
            case "twenty fourth":
                return 24;
            case "twenty fifth":
                return 25;
            case "twenty sixth":
                return 26;
            case "twenty seventh":
                return 27;
            case "twenty eighth":
                return 28;
            case "twenty nineth":
                return 29;
            case "thirtieth":
                return 30;
            case "thirty first":    
                return 31;
            default:
                return 0;
        }
    } 
    public int convertYear(String inputYear) {
        String[] wordsSplit = inputYear.split(" ");
        int year = 0;
        for(int i = 0; i < wordsSplit.length; i++) {
            if(convertWord(wordsSplit[i]) == -1) {
                return 0;
            }
            else if(wordsSplit[i].equals("thousand")) { 
                year = year + convertWord(wordsSplit[i-1]) * 999;
                continue;
            }
            else if(wordsSplit[i].equals("hundred")) { 
                year += convertWord(wordsSplit[i-1]) * 99;
                continue;
            }
            year = year + convertWord(wordsSplit[i]);
        }
        return year;
    }
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
        if(!checkdate(date)){
            this.day= 0;
            this.month = 0;
            this.year = 0;
            System.out.println("Input invalid!!");
        };
    }
    public MyDate(String day, String month, String year) {
        super();
        if(convertDay(day) == 0 || convertMonth(month) == 0 || convertYear(year) == 0) {
            return;
        }
        this.day = convertDay(day);
        this.month = convertMonth(month);
        this.year = convertYear(year);
        this.extensionDay = day.substring(day.length() - 2);
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
    public boolean checkdate(String date){
        int year,month,day;
        String words[] = date.split("\\s");

        if(words.length>3||checkMonth(words[0])==0||words[1].length()>=5) return false;

        try {
                year = Integer.parseInt(words[2]);

                month = checkMonth(words[0]);

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

public int getDay() {
    return this.day;
}
public void setDay(int day) {
    this.day = day;
}
public int getMonth() {
    return this.month;
}
public void setMonth(int month) {
    this.month = month;
}
public int getYear() {
    return this.year;
}
public void setYear(int year) {
    this.year = year;
}
public static String prependZero(int inputNumber) {
    return (inputNumber < 10 ? "0" + inputNumber : Integer.toString(inputNumber));
}
public static void main(String[] args) {

    
    MyDate test = new MyDate("first", "February", "two thousand and one");
    System.out.println("Choose format: ");
    Scanner obj = new Scanner(System.in);
    String format = obj.nextLine();
    switch(format) {
        case "yyyy-MM-dd":
            System.out.println(test.getYear() + "-" + prependZero(test.getMonth()) + "-" + prependZero(test.getDay()));
            break;
        case "d/M/yyyy":
            System.out.println(prependZero(test.getDay()) + "/" + prependZero(test.getMonth()) + "/" + test.getYear());
            break;
        case "dd-MMM-yyyy":
            System.out.println(prependZero(test.getDay()) + "-" + test.validMonths[test.getMonth() - 1].substring(0, 3) + "-" + test.getYear());
            break;
        case "MMM d yyyy":
            System.out.println(test.validMonths[test.getMonth() - 1].substring(0, 3) + " " + prependZero(test.getDay()) + " " + test.getYear());
            break;
        case "mm-dd-yyyy":
            System.out.println(prependZero(test.getDay()) + "-" + prependZero(test.getMonth()) + "-" + test.getYear());
            break;
        default: 
            System.out.println("Wrong format");
        
    }
    obj.close();
}     
}