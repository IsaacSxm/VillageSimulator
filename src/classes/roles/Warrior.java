package classes.roles;

public class Warrior extends Roles{
    //    Todo: Jonathan
    public Warrior(Villager villager) {
        super(villager);
    }

    @Override
    public String getTitle() {
        return "Warrior";
    }
}
