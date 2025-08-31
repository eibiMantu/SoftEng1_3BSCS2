package factoryPattern;
public class Dog implements Pet {
    private String breed;

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public String play() {
        return "Catch and Fetch!";
    }

    @Override
    public String makeSound() {
        return "Aw! Aw!";
    }
    
}