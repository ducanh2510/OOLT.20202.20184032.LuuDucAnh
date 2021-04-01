

public class Aims {
    public static void main(String[] args) {
        Order order = new Order();
        DigitalVideoDisc dv1 = new DigitalVideoDisc("The Lions King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dv2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",124,24.95f);
        DigitalVideoDisc dv3 = new DigitalVideoDisc("Aladdin","Annimation","John Musker",90,  18.99f);
        DigitalVideoDisc dv4 = new DigitalVideoDisc("Aladdin","Annimation","John ",90,  18.99f);
        DigitalVideoDisc dv5 = new DigitalVideoDisc("HuyenNguyen", "anime ost", "Vu Tuyen",100,88.45f);
        DigitalVideoDisc dv6 = new DigitalVideoDisc("Ruby", "anime ost", "Vu Tuyen",100,88.45f);
        DigitalVideoDisc dv7 = new DigitalVideoDisc("Ruby2", "anime ost", "Vu Tuyen",100,88.45f);
        DigitalVideoDisc dv[]={dv4,dv5,dv6,dv7};
        

        // DigitalVideoDisc dv8 = new DigitalVideoDisc("Ruby3", "anime ost", "Vu Tuyen",100,88.45f);
        // DigitalVideoDisc dv9 = new DigitalVideoDisc("Ruby4", "anime ost", "Vu Tuyen",100,88.45f);
        // DigitalVideoDisc dv10 = new DigitalVideoDisc("Ruby5", "anime ost", "Vu Tuyen",100,88.45f);
        // DigitalVideoDisc dv11= new DigitalVideoDisc("Ruby6", "anime ost", "Vu Tuyen",100,88.45f);
        // DigitalVideoDisc dv12 = new DigitalVideoDisc("Ruby7", "anime ost", "Vu Tuyen",100,88.45f);
        // DigitalVideoDisc dv13= new DigitalVideoDisc("Ruby8", "anime ost", "Vu Tuyen",100,88.45f);

        order.addDigitalVideoDisc(dv1);
        order.addDigitalVideoDisc(dv2);
        order.addDigitalVideoDisc(dv3);
    //    order.addDigitalVideoDisc(dv4);
    //    order.addDigitalVideoDisc(dv5);
    //    order.addDigitalVideoDisc(dv6);
    //    order.addDigitalVideoDisc(dv7);
       order.addDigitalVideoDisc(dv);
//        order.addDigitalVideoDisc(dv8);
//        order.addDigitalVideoDisc(dv9);
//        order.addDigitalVideoDisc(dv10);
//        order.addDigitalVideoDisc(dv11);
//        order.addDigitalVideoDisc(dv12);

        float totalCost= order.totalCost();

        System.out.println("totalCost = "+totalCost);
        order.removeDigitalVideoDisc(dv1);
        order.removeDigitalVideoDisc(dv2);
        order.removeDigitalVideoDisc(dv3);
        order.removeDigitalVideoDisc(dv4);
        System.out.println("total order:"+order.getQtyOrder());
    }
}
