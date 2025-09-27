package commandPattern;

public class TempDown implements Command {
    private Room room;

    public TempDown(Room room){
        this.room = room;
    }


    @Override
    public String execute() {
        return room.tempDown();
    }
}