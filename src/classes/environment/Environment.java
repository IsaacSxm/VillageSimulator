package classes.environment;

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
        // calculating food - poison and good food
        this.village.getForageSize();
        for(int i = 0; i < 10; i++){
            //good food
        }
        for(int i = 0; i < 10; i++){
            //poison food
        }
    }

}
