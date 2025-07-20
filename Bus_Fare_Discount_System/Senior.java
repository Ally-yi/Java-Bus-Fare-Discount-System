package Bus_Fare_Discount_System;
/*
 * Program Description:
 * Senior class inherits from BusFare and calculates a 50% discounted fare.
 * The ticket color is grey. It overrides the get_rate() method and fare() method to calculate the fare and print it.
 */
public class Senior extends BusFare{
    private final String COLOR ="grey";
    private final Double DISCOUNT_RATE =0.5;

    @Override
    public Double getRate(){
        return BASE_FARE * DISCOUNT_RATE;
    }

    @Override
    public void fare(){
        System.out.println("Fare: "+getRate()+", color="+ COLOR);
    }
}
