package classes.environment;

import interfaces.EnvironmentCondition;

public class Desert implements EnvironmentCondition {
    //    Todo: Virag

    protected final static int MINIMUM_WARRIOR_SPAWN = 1;
    protected final static int MAXIMUM_WARRIOR_SPAWN = 5;
    protected final static int MINIMUM_POISON_SPAWN = 1;
    protected final static int MAXIMUM_POISON_SPAWN = 2;
    protected final static int MINIMUM_GOOD_SPAWN = 1;
    protected final static int MAXIMUM_GOOD_SPAWN = 3;

    //  Get Condition Type function
    public void getConditionType(){
        //  get the type of the environment
    }

    //  Warrior Spawn function
    public void getSpawnWarrior(){
        //
    }

    //  Poison Spawn function
    public void getSpawnPoisonFood(){
        //
    }

    //  Good Spawn function
    public void getSpawnGoodFood(){
        //
    }
}
