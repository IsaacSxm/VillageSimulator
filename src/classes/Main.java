package classes;

import classes.environment.Desert;
import classes.environment.Environment;
import classes.environment.RainForest;
import classes.roles.Chief;
import classes.roles.Farmer;
import classes.roles.Roles;
import classes.roles.Warrior;
import classes.village.VillagerBuilder;
import java.util.Scanner;

public class Main {
    private Environment environment;
    private Scanner userInput = new Scanner(System.in);
    private int startCommand;
    private int villagerCommand;
    private VillagerBuilder villagerBuilder = new VillagerBuilder();
    private String newVillagerCommand;
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
        System.out.println("You have successfully created a " + this.environment.getEnvironmentCondition().getConditionType());
        System.out.println("Press 1 to create a chief");
        System.out.println("Press 2 to create a farmer");
        System.out.println("Press 3 to create a warrior");
        villagerCommand = userInput.nextInt();
        switch (villagerCommand) {
            case 1 -> {
                Roles role1 = new Chief(this.villagerBuilder.build());
                this.environment.getVillage().addVillager(role1);
                System.out.println(role1.getTitle() + " villager created");
            }
            case 2 -> {
                Roles role2 = new Farmer(this.villagerBuilder.build());
                this.environment.getVillage().addVillager(role2);
                System.out.println(role2.getTitle() + " villager created");
            }
            case 3 -> {
                Roles role3 = new Warrior(this.villagerBuilder.build());
                this.environment.getVillage().addVillager(role3);
                System.out.println(role3.getTitle() + " villager created");
            }
        }
        System.out.println("Press N to create another Villager or X to start simulation");
        this.newVillagerCommand = userInput.next();
        switch (this.newVillagerCommand) {
            case "N" -> this.creatAVillager();
            case "X" -> this.simulate();
        }
    }
    private void simulate() {

    }
}
