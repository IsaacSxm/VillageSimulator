package classes.food;

import interfaces.Food;

public class GoodFood implements Food {
    protected static final int MINIMUM_HEALTH = 5;
    protected static final int MAXIMUM_HEALTH = 60;

    @Override
    //  Get the type of the food
    public String getFoodType() {

        return "Good";
    }

    @Override
    //  Get the impact of the good food
    public int getImpact() {

        return (int) ((Math.random() * (MAXIMUM_HEALTH - MINIMUM_HEALTH)) + MINIMUM_HEALTH);
    }
}
