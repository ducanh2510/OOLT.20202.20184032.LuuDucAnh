package My_Date;

public class DataTest {
	public static void main(String[] args) {
        MyDate md1 = new MyDate(2,3,2020);
        md1.print();

        MyDate md2 = new MyDate("February -1th 2020");
        md2.print();

        MyDate md3 = new MyDate("December 2th 2000");
        md3.print();

        MyDate md = new MyDate();
        md.print();
    }
}
