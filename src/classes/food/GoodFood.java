package classes.food;

import interfaces.Food;
//ToDo: Virag
public class GoodFood implements Food {
    protected static final int MINIMUM_HEALTH = 5;
    protected static final int MAXIMUM_HEALTH = 60;

    @Override
    public String getFoodType() {

        return "Good";
    }

    @Override
    public int getImpact() {

        return (int) ((Math.random() * (MAXIMUM_HEALTH - MINIMUM_HEALTH)) + MINIMUM_HEALTH);
    }
}
