package game.command;

public class Quit extends Command {

    @Override
    protected void inGame(){
        player = null;
        gameMap = null;
        gameObserver.addOutput("You have quit the current game.\n");
        gameObserver.setRecordHistory(false);
        gameObserver.clearCommandHistory();
    }

}
