package game.controls;

import game.command.Command;
import game.command.CommandFactory;
import game.command.Drop;
import game.controls.GameConsole;
import game.controls.GameHistory;
import game.map.GameMap;
import game.player.Player;

public class CommandParser {

    private Player player;
    private Command calledCommand;

    public CommandParser(Player player) {
        this.player = player;
        calledCommand = new Drop();
        calledCommand.setPlayer(player);
    }

    public void takeInput(String command) {
        command = command.trim().toLowerCase();
        Command calledCommand = CommandFactory.createCommand(command);
        if(calledCommand != null) {
            calledCommand.execute();
            GameHistory.addHistory(command);
        }
        else{
            GameConsole.addOutput("Unknown command");
        }
    }

}
