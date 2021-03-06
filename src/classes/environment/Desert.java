package classes.environment;

import interfaces.EnvironmentCondition;

public class Desert implements EnvironmentCondition {
    protected final static int MINIMUM_WARRIOR_SPAWN = 1;
    protected final static int MAXIMUM_WARRIOR_SPAWN = 5;
    protected final static int MINIMUM_POISON_SPAWN = 1;
    protected final static int MAXIMUM_POISON_SPAWN = 2;
    protected final static int MINIMUM_GOOD_SPAWN = 1;
    protected final static int MAXIMUM_GOOD_SPAWN = 3;

    @Override
    //  Get Condition Type function
    public String getConditionType() {
        return "Desert";
    }

    @Override
    //  Warrior Spawn function
    public int spawnWarriors() {
        return (int) ((Math.random() * (MAXIMUM_WARRIOR_SPAWN - MINIMUM_WARRIOR_SPAWN)) + MINIMUM_WARRIOR_SPAWN);
    }

    @Override
    //  Poison Spawn function
    public int spawnPoisonFood() {
        return (int) ((Math.random() * (MAXIMUM_POISON_SPAWN - MINIMUM_POISON_SPAWN)) + MINIMUM_POISON_SPAWN);
    }

    @Override
    //  Good Spawn function
    public int spawnGoodFood() {
        return (int) ((Math.random() * (MAXIMUM_GOOD_SPAWN - MINIMUM_GOOD_SPAWN)) + MINIMUM_GOOD_SPAWN);
    }
}
