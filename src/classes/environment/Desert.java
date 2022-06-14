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
    public String getConditionType(){
        //  get the type of the environment
        return "Desert";
    }

    //  Warrior Spawn function
    public int spawnWarriors(){
        //  counting
        return (int) ((Math.random() * (MAXIMUM_POISON_SPAWN - MINIMUM_WARRIOR_SPAWN)) + MINIMUM_WARRIOR_SPAWN);
    }

    //  Poison Spawn function
    public int spawnPoisonFood(){
        //  counting
        return (int) ((Math.random() * (MAXIMUM_POISON_SPAWN - MINIMUM_POISON_SPAWN)) + MINIMUM_POISON_SPAWN);
    }

    //  Good Spawn function
    public int spawnGoodFood(){
        //  counting
        return  (int) ((Math.random() * (MAXIMUM_GOOD_SPAWN - MINIMUM_GOOD_SPAWN)) + MINIMUM_GOOD_SPAWN);
    }
}
