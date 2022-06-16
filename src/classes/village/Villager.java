package classes.village;

import classes.roles.Roles;
import interfaces.Food;

public interface Villager {
    String getRole();

    void setRole(Roles role);

    void setHealth(int health);

    int getHealth();

    int getAge();

    void setAge(int age);

    String getGender();

    void setGender(String gender);

    boolean isAlive();

    void setAlive(boolean lifeOrDeath);

    void kill();

    void eat(Food food);
}
