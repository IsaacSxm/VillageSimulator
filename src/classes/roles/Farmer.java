package classes.roles;

import classes.village.Villager;

public class Farmer extends Roles{
    public Farmer(Villager villager) {
        super(villager);
    }

    @Override
    public String getTitle() {
        return "Farmer";
    }
}
