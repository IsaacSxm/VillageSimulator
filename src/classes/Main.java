package classes;

import classes.environment.Desert;
import classes.environment.Environment;
import classes.environment.RainForest;
import classes.roles.Chief;
import classes.roles.Farmer;
import classes.roles.Roles;
import classes.roles.Warrior;
import classes.village.VillagerBuilder;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private Environment environment;
    private Scanner userInput = new Scanner(System.in);
    private int startCommand;
    private VillagerBuilder villagerBuilder = new VillagerBuilder();
    private int numberOfDays;


    public void startMessage() {
        System.out.println("This is a Villager simulation");
        System.out.print("Press 1 to select a Desert environment or 2 to select a Rain forest environment");
        startCommand = userInput.nextInt();
        switch (startCommand) {
            case 1 -> this.environment = new Environment(new Desert());
            case 2 -> this.environment = new Environment(new RainForest());
        }
        System.out.print("Enter the number of days you want your simulation to run for");
        this.numberOfDays = userInput.nextInt();
        this.creatAVillager();
    }

    public void setUserInput(Scanner scanner) {
        this.userInput = scanner;
    }
    public void creatAVillager() {

    }
    private void simulate() {

    }
}
