package factoryPattern;

import java.util.*;

public class Clinic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Choose pet");
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");

        PetRecord petRecord = new PetRecord();
        Pet pet;

        System.out.print("\nEnter number choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                pet = new Dog();
                petRecord.setPetId("P001");
                petRecord.setPetName("Bantay");
                petRecord.setPet(pet);
                ((Dog)pet).setBreed("Aspin");
                break;

            case 2:
                pet = new Cat();
                petRecord.setPetId("P002");
                petRecord.setPetName("Muning");
                petRecord.setPet(pet);
                ((Cat)pet).setnoOfLives(9);
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.exit(0);
        }

        System.out.println("Pet id: " + petRecord.getPetId());
        System.out.println("Pet name is "+ petRecord.getPetName());
        System.out.println("Pet kind: " + petRecord.getClass().getSimpleName());
        System.out.println("Communication sound: "+ petRecord.getPet().makeSound());
        System.out.println("Play mode: " + petRecord.getPet().play());
    }   
}
