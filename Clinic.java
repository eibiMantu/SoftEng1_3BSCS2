import java.util.*;

public class Clinic {
    public static void main(String[] args) {
        
Scanner input =new Scanner(System.in());

        System.out.println("Choose pet");
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");

        PetRecord petRecord = new PetRecord();
        Pet pet;

        System.out.print("\nEnter number choice: ");
        int choice = input.nextInt();

        switch choice {
            case 1: pet = new Dog();
                    petRecord.setPetID("P001")
                    petRecord.setPetName("Bantay");
                    petRecord.setPet(new Dog);
                    ((Dog)pet).setBreed("Aspin");
                
                break;
            case 2: petRecord.setPetID("P001")
                    petRecord.setPetName("Muning");
                    petRecord.setPet(pet);
                    ((Cat)pet).setNoOfLives((9));
                
                break;
            default:
                System.exit(0);
        }

    }
}
