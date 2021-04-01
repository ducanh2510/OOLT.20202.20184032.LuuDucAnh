public class DateUtils {
    public static int compare(MyDate d1, MyDate d2) {
        if(d1 != null && d2 != null) {
            if(d1.getYear() > d2.getYear()) {
                return 1;
            }
            else if(d1.getYear() < d2.getYear()) {
                return -1;
            }
            else {
                if(d1.getMonth() > d2.getMonth()) {
                    return 1;
                }
                else if(d1.getMonth() < d2.getMonth()) {
                    return -1;
                }
                else {
                    if(d1.getDay() > d2.getDay()) {
                        return 1;
                    }
                    else if(d1.getDay() < d2.getDay()) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
        return -1;
    }
    public static void swap(MyDate d1, MyDate d2) {
        if(d1 != null && d2 != null) {
            int temp = d1.getDay();
            d1.setDay(d2.getDay());
            d2.setDay(temp);

            temp = d1.getMonth();
            d1.setMonth(d2.getMonth());
            d2.setMonth(temp);

            temp = d1.getYear();
            d1.setYear(d2.getYear());
            d2.setYear(temp);
        }
    }
    public static void sort(MyDate[] dates) {
        for(int i = 0; i < dates.length - 1; i++) {
            for(int j = i + 1; j < dates.length; j++) {
                if(compare(dates[i], dates[j]) == -1) {
                    swap(dates[i], dates[j]);
                } 
            }
        }
    }
    public static void main(String[] args) {
        MyDate d1 = new MyDate(25, 10, 2000);
        MyDate d2 = new MyDate(25, 10, 2000);
        MyDate d3 = new MyDate(26, 10, 2001);
        MyDate d4 = new MyDate(20, 10, 1999);
        MyDate[] arr = {d1, d2, d3, d4};
        sort(arr);
        for(MyDate d : arr) {
            d.print();
        }
    }
}
