package game.command;

public class Quit extends Command {

    @Override
    protected void inGame(){
        player = null;
        gameMap = null;
        output.add("You have quit the current game.\n");
    }

}
