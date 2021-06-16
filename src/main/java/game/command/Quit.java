package game.command;

import game.controls.GameConsole;
import game.controls.GameHistory;

public class Quit extends Command {

    @Override
    protected void inGame(){
        player = null;
        gameMap = null;
        GameConsole.addOutput("You have quit the current game.\n");
        GameHistory.stopRecordHistory();
        GameHistory.clearCommandHistory();
    }

}
