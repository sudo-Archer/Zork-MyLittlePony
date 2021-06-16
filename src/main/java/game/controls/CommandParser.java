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
    private GameMap gameMap;
    private Command calledCommand;

    public CommandParser(Player player, GameMap gameMap) {
        this.player = player;
        this.gameMap = gameMap;
        calledCommand = new Drop();
        calledCommand.setGameMap(gameMap);
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
