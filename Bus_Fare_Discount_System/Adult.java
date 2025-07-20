package Bus_Fare_Discount_System;
/*
 * Program Description:
 * Adult class inherits from BusFare and prints the regular fare and color.
 */
public class Adult extends BusFare{
    @Override
    public void fare(){
        System.out.println("Fare: "+ getRate()+", color="+ getColor());
    }
}
