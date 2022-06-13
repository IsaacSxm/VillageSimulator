package classes.environment;

import classes.village.Village;
import interfaces.EnvironmentCondition;

public class Environment {
    //    Todo: Virag

    protected EnvironmentCondition environmentCondition;
    protected Village village;
    protected int duration = 0;
    protected int numberOfWarriors = 0;
    protected int numberOfFarmers = 0;

    public Environment(EnvironmentCondition condition) {
        this.environmentCondition = condition;
        this.village = new Village();
    }
}
