package classes.village;

import classes.roles.Roles;
import interfaces.Food;

import java.util.ArrayList;
import java.util.List;

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

    public void setPopulation(List<Roles> population) {
        this.population = population;
    }
}
