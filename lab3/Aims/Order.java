package lab_03;

import java.util.ArrayList;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrder = 0;

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

}
