package classes.food;

import interfaces.Food;
//ToDo: Virag
public class GoodFood implements Food {
    private int MINIMUM_HEALTH;
    private int MAXIMUM_HEALTH;
    
    @Override
    public String getFoodType() {
        return null;
    }

    @Override
    public int getImpact() {
        return 0;
    }
}
