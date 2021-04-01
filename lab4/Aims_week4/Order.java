
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrders = 0;
    private int qtyOrder = 0;
    private MyDate dateOrdered;

    public void setQtyOrder(int qtyOrder) {
        this.qtyOrder = qtyOrder;
    }

    public int getQtyOrder() {
        return qtyOrder;
    }
   

    public void addDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        if(qtyOrder < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrder++] = digitalVideoDisc;
            System.out.println("This disc has been added!!");
            System.out.println("this qtyOrder = "+qtyOrder);
        } else System.out.println("The order is almost full!!");

    }
    public void addDigitalVideoDisc(DigitalVideoDisc []dvdlist){
        if(qtyOrder+dvdlist.length < MAX_NUMBERS_ORDERED) {
            for(int i=0;i<dvdlist.length;i++)
            itemsOrdered[qtyOrder++] = dvdlist[i];
            System.out.println("This disc has been added!!");
            System.out.println("this qtyOrder = "+qtyOrder);
        } else System.out.println("The order is almost full!!");

    }
    public void addDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc1,DigitalVideoDisc digitalVideoDisc2){
        if(qtyOrder+2 < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrder++] = digitalVideoDisc1;
            itemsOrdered[qtyOrder++]=digitalVideoDisc2;
            System.out.println("This disc has been added 2 disc!!");
            System.out.println("this qtyOrder = "+qtyOrder);
        
        }
        else if(qtyOrder+1 < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrder++]=digitalVideoDisc2;
            System.out.println("This disc has been added 1 disc!!");
            System.out.println("this qtyOrder = "+qtyOrder);
        }
        else System.out.println("The order is almost full!!");

    }
    public void removeDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        if(qtyOrder != 0){
            int i;
            for(i = 0; i<qtyOrder;i++){

                if(digitalVideoDisc == itemsOrdered[i]){
                    for(int j = i; j < qtyOrder - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    --qtyOrder;
                    System.out.println("Removed this disc!!");
                    return;
                }
            }
            System.out.println("This is not in itemOrdered!!");
        } else System.out.println("itemsOrdered is now empty!!");

    }
    public float totalCost(){
        float total=0;

        for(int i = 0 ; i < qtyOrder ; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void printListOrder(){
        System.out.println("***********************Order***********************");
        System.out.print("Date: ");
        this.dateOrdered.print();
        for (int i = 0; i < this.qtyOrder; i++){
            System.out.println((i+1)+".DVD-"+ this.itemsOrdered[i].getTitle()+"-"
                    +this.itemsOrdered[i].getCategory()+"-"
                    +this.itemsOrdered[i].getDirector()+"-"
                    +this.itemsOrdered[i].getLength()+" price: "
                    +this.itemsOrdered[i].getCost()+"$");
        }
        System.out.println("Total cost: "+totalCost());
    }
    public Order() {
        if(nbOrders<MAX_LIMITED_ORDERS){
            this.dateOrdered = new MyDate();
            ++nbOrders;
        }else {
            System.out.println("Max Orders!!!");
        }
 
    }

}
