package classes.village;

import interfaces.Food;

public class VillagerPerson implements Villager{
    private String role;
    private int health;
    private int age;
    private String gender;
    private boolean isAlive;
    private Food food;

    public VillagerPerson(VillagerBuilder villagerBuilder) {
        this.health = villagerBuilder.getHealth();
        this.gender = villagerBuilder.getGender();
        this.age = villagerBuilder.getAge();
        this.gender = villagerBuilder.getGender();
//        this.isAlive = villagerBuilder.isAlive();
    }


}
