package classes.roles;

import classes.village.Villager;

public abstract class Roles {
//    Todo: Jonathan
    public Villager villager;
    public Roles(Villager villager){
        this.villager = villager;
    }

    public abstract String getTitle();
}
