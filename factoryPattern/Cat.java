package factoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;

    public Integer getnoOfLives(){
        return noOfLives;
    }

    public void setnoOfLives(Integer noOfLives){
        this.noOfLives = noOfLives;
    }

    @Override
    public String play() {
        return "Pouncing a dead rat!";
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }
    
}