package ro.Fasttrackit.lab7;

public class BottleObj {
    public static void main(String[] arg){
        Bottle prod1 = new Bottle(4, 3,true,"Coca");
        Bottle prod2 = new Bottle(5, 8, false,"Sprite");
        Bottle prod3 = new Bottle(6,5,true,"Fanta");

        prod1.open();
        prod1.close();
        prod1.moreLiquid();
        prod1.availabalLiquid();
        System.out.println(prod3.drink(3));
        System.out.println(prod3.drink(2));


    }
    public static void printBottle(Bottle botlle){

    }

   
}
