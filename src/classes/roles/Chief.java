package classes.roles;

public class Chief extends Roles{
    //    Todo: Jonathan
    public Chief(Villager villager) {
        super(villager);
    }

    @Override
    public String getTitle() {
        return "Chief";
    }
}
