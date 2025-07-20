package Bus_Fare_Discount_System;

/*
 * Program Description:
 * Test program to create instances of Senior, Supersenior, and Adult classes,
 * representing Ted, Ed, and Chloe respectively, and print their bus fares.
 */

public class myBusFare {
    public static void main(String[] args) {
        Senior Ted= new Senior();
        Ted.fare();

        Adult Chloe= new Adult();
        Chloe.fare();

        SuperSenior Ed= new SuperSenior();
        Ed.fare();
    }
}
