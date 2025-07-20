package Bus_Fare_Discount_System;

/*
 * Program Description:
 * Abstract superclass representing a bus fare with base fare and ticket color.
 * It provides methods to get the base fare and color, and declares an abstract method fare()
 */

public abstract class BusFare {
    protected final Double BASE_FARE =6.0;
    protected final String COLOR ="red";

    public Double getRate(){
        return BASE_FARE;
    }

    public String getColor(){
        return COLOR;
    }

    public abstract void fare();
}
