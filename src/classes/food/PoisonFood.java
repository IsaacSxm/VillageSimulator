package classes.food;

import interfaces.Food;

public class PoisonFood implements Food {
    @Override
    public String getFoodType() {
        return null;
    }

    @Override
    public int getImpact() {
        return 0;
    }
}
