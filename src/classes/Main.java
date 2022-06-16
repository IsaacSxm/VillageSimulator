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
    private Scanner input = new Scanner(System.in);
    private int startCommand;
    private int villagerCommand;
    private VillagerBuilder villagerBuilder = new VillagerBuilder();
    private String newVillagerCommand;
    private int numberOfDays;
    private String restartSimulation;


    public void welcomeMessage() {
        System.out.println("This is a Villager simulation ");
        System.out.print("Press 1 to select a Desert environment or 2 to select a Rain forest environment ");
        startCommand = input.nextInt();
        switch (startCommand) {
            case 1 -> this.environment = new Environment(new Desert());
            case 2 -> this.environment = new Environment(new RainForest());
            default -> this.welcomeMessage();
        }
        System.out.print("Enter the number of days you want your simulation to run for ");
        this.numberOfDays = input.nextInt();
        System.out.println("You have successfully created a " + this.environment.getEnvironmentCondition().getConditionType());
        this.creatAVillager();
    }

    public void setInput(Scanner scanner) {
        this.input = scanner;
    }

    public void creatAVillager() {
        System.out.println("Press 1 to create a chief ");
        System.out.println("Press 2 to create a farmer ");
        System.out.println("Press 3 to create a warrior ");
        villagerCommand = input.nextInt();
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
            default -> {
                System.out.println("Wrong Input");
                this.creatAVillager();
            }
        }
        System.out.println("Press N to create another Villager or X to start simulation ");
        this.newVillagerCommand = input.next();
        switch (this.newVillagerCommand.toUpperCase()) {
            case "N" -> this.creatAVillager();
            case "X" -> this.simulate();
            default -> input.next();
        }
    }
    private void simulate() {
        System.out.println("Creating environments ------------");
        System.out.println("Building villagers ------------");
        System.out.println("Spawning biomes -----------");
        System.out.println("Spawning enemies -----------");
        System.out.println("Spawning foods -----------");
        for (int i = 0; i < this.numberOfDays; i++) {
            this.environment.forage();
            boolean warResult = this.environment.getVillage().fight(this.environment.getEnvironmentCondition().spawnWarriors());
            System.out.println("The war was won: " + warResult);
            this.environment.getVillage().feed();
            System.out.println("Day " + i + " -----------completed!");
        }
        System.out.println("Simulation completed -----------");
        System.out.println("Results -----------");
        System.out.println("Final population: " + this.environment.getVillage().getPopulation() + " -----------");
        System.out.println("Survivor population: " + this.environment.getVillage().getSurvivorCount() + " -----------");
        System.out.println("Death population: " + this.environment.getVillage().getMortalityCount() + " -----------");
        System.out.println("Female population: " + this.environment.getVillage().femaleGenderCount() + " -----------");
        System.out.println("Male population: " + this.environment.getVillage().maleGenderCount() + " -----------");
        System.out.println("Is Chief Alive: " + this.environment.getVillage().isChiefAlive() + " -----------");
        System.out.println("Final food storage capacity: " + this.environment.getVillage().getForageSize() + " -----------");
        System.out.println("Game over! Thank you for using our platform! press R to restart.");
        this.restartSimulation = input.next();
        if (this.restartSimulation.equalsIgnoreCase("r")) {
            this.welcomeMessage();
        }
    }
}
