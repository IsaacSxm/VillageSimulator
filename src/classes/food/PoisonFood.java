package classes.food;

import classes.village.Villager;
import interfaces.Food;
//ToDo : Jonathan
public class PoisonFood implements Food {

    protected static final int MINIMUM_DAMAGE = 25;
    protected static final int MAXIMUM_DAMAGE = 100;

    public PoisonFood() {
    }

    @Override
    public String getFoodType() {
        return "Poison";
    }

    @Override
    public int getImpact() {
        return (int) ((Math.random() * (MAXIMUM_DAMAGE - MINIMUM_DAMAGE)) + MINIMUM_DAMAGE);
    }
}
