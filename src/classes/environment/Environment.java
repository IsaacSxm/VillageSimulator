package classes.environment;

import classes.village.Village;
import interfaces.EnvironmentCondition;

public class Environment {
    //    Todo: Virag

    protected EnvironmentCondition environmentCondition;
    protected Village village;
    protected int duration;
    protected int numberOfWarriors;
    protected int numberOfFarmers;

    public Environment(EnvironmentCondition condition, int duration, int numberOfWarriors, int numberOfFarmers) {
        this.environmentCondition = condition;
        this.village = new Village();
        this.duration = duration;
        this.numberOfWarriors = numberOfWarriors;
        this.numberOfFarmers = numberOfFarmers;
    }
}
