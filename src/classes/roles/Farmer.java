package classes.roles;

public class Farmer extends Roles{
    //    Todo: Jonathan
    public Farmer(Villager villager) {
        super(villager);
    }

    @Override
    public String getTitle() {
        return "Farmer";
    }
}
