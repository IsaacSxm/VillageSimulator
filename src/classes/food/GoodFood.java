package classes.food;

import interfaces.Food;
//ToDo: Virag
public class GoodFood implements Food {
    private static int MINIMUM_HEALTH;
    private static int MAXIMUM_HEALTH;

    @Override
    public String getFoodType() {

        return "Good";
    }

    @Override
    public int getImpact() {

        return (int) ((Math.random() * (MAXIMUM_HEALTH - MINIMUM_HEALTH)) + MINIMUM_HEALTH);
    }
}
