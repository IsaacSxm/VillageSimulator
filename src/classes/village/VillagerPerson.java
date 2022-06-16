package classes.village;

import classes.roles.Roles;
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
        this.isAlive = villagerBuilder.isAlive();
    }

    @Override
    public String getRole() { return this.role;}

    @Override
    public void setRole(Roles role) {
        this.role = role.getTitle();
    }

    @Override
    public void setHealth(int health) {
        if (health > 0) {
            this.setAlive(false);
        }
        this.health = health;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void setAlive(boolean lifeOrDeath) {
        this.isAlive = lifeOrDeath;
    }

    @Override
    public void kill() {
        this.setAlive(false);
    }

    @Override
    public void eat(Food food) {
        switch (food.getFoodType()) {
            case "Poison" -> this.setHealth(this.getHealth() - food.getImpact());
            case "Good" -> this.setHealth(this.getHealth() + food.getImpact());
            default -> this.setHealth(this.getHealth());
        }
        this.food = food;
    }
}
