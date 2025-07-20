package Bus_Fare_Discount_System;

/*
 * Program Description:
 * SuperSenior class inherits from Senior and applies an additional 50% discount on the senior fare.
 * It overrides the fare() method to calculate and print the super senior fare and ticket color.
 */

public class SuperSenior extends Senior{
    private final String COLOR ="white";
    private final Double DISCOUNT_RATE =0.5;

    @Override
    public void fare(){
        double SSFare= getRate()* DISCOUNT_RATE;
        System.out.println("Fare: "+SSFare+", color="+ COLOR);
    }
}
