public class Cat implements Pet {} {
    private Integer noOfLives;


    
    public Integer getnoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
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
