package classes.environment;

import classes.food.GoodFood;
import classes.food.PoisonFood;
import classes.village.Village;
import interfaces.EnvironmentCondition;

public class Environment {
    protected EnvironmentCondition environmentCondition;
    protected Village village;
    protected int duration;
    protected int numberOfWarriors;
    protected int numberOfFarmers;

    public Environment(EnvironmentCondition condition) {
        this.environmentCondition = condition;
        this.village = new Village();
    }

    //  Getters and Setters
    public EnvironmentCondition getEnvironmentCondition() {
        return environmentCondition;
    }

    public void setEnvironmentCondition(EnvironmentCondition environmentCondition) {
        this.environmentCondition = environmentCondition;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfWarriors() {
        return numberOfWarriors;
    }

    public void setNumberOfWarriors(int numberOfWarriors) {
        this.numberOfWarriors = numberOfWarriors;
    }

    public int getNumberOfFarmers() {
        return numberOfFarmers;
    }

    public void setNumberOfFarmers(int numberOfFarmers) {
        this.numberOfFarmers = numberOfFarmers;
    }

    //  Method(s)
    public void forage(){
        this.village.getForageSize();
        for(int i = 0; i < this.getEnvironmentCondition().spawnPoisonFood(); i++){
            this.village.getFood().add(new PoisonFood());
        }
        for(int i = 0; i < this.getEnvironmentCondition().spawnGoodFood(); i++){
            this.village.getFood().add(new GoodFood());
        }
    }
}
