package classes.village;

import classes.roles.Roles;
import interfaces.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Village {

    protected List<Roles> population;
    protected List<Food> food;

    public Village() {
        this.population = new ArrayList<>();
        this.food = new ArrayList<>();
    }

    public int getPopulation() {
        return population.size();
    }

    public void setPopulation(List<Roles> population) {
        this.population = population;
    }

    public void addVillager(Roles role) {
        this.population.add(role);
    }

    public int femaleGenderCount() {
        return (int) this.population.stream().filter(roles -> Objects.equals(roles.villager.getGender(), "Female")).count();
    }

    public int maleGenderCount() {
        return (int) this.population.stream().filter(roles -> Objects.equals(roles.villager.getGender(), "Male")).count();
    }

    public int getMortalityCount() {
        return (int) this.population.stream().filter(roles -> !roles.villager.isAlive()).count();
    }

    public int getSurvivorCount() {
        return (int) this.population.stream().filter(roles -> roles.villager.isAlive()).count();
    }

    public int getDefence() {
        return (int) this.population.stream().filter(roles -> Objects.equals(roles.getTitle(), "Warrior")).count();
    }

    public List<Roles> getWarriorVillagers() {
        return this.population.stream().filter( roles -> Objects.equals(roles.getTitle(), "Warrior")).collect(Collectors.toList());
    }

    public boolean isChiefAlive() {
        return (int) this.population.stream().filter(roles -> Objects.equals(roles.getTitle(), "Chief")).count() > 0;
    }

    public int getForageSize() {
        return (int) this.population.stream().filter(roles -> Objects.equals(roles.getTitle(), "Farmer")).count();
    }

    public int getFinalForageCapacity() {
        return this.getForageSize() * (int) ((Math.random() * (2)));
    }

    public List<Food> getFood() {
        return this.food;
    }

    public boolean fight(int enemySize) {
        int defence = this.getDefence();
        if (enemySize - defence > 1) {
            for (Roles role: this.population)
            {
                /*
                Murder all VILLAGERS!!
                 */
                role.villager.kill();
            }
            return false;
        }
        for (int i = 0; i < enemySize - 1; i++){
            /*
                Murder just a little :(
                 */
            this.getWarriorVillagers().get(i).villager.kill();
        }
        return true;
    }

    public void feed() {
        for (int i = 0; i < this.getSurvivorCount() && i < this.food.size(); i++) {
            this.population.get(i).villager.eat(this.food.get(i));
        }
    }

}
