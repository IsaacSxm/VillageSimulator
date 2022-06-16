package classes.roles;

import classes.village.Villager;

public abstract class Roles {
    public Villager villager;
    public Roles(Villager villager){
        this.villager = villager;
    }

    public abstract String getTitle();
}
