package game;

import game.command.Command;
import game.command.CommandFactory;
import game.command.Drop;
import game.map.GameMap;
import game.player.Player;

public class CommandParser {

    private GameObserver gameObserver;
    private Player player;
    private GameMap gameMap;
    private Command calledCommand;

    public CommandParser(GameObserver gameObserver, Player player, GameMap gameMap) {
        this.gameObserver = gameObserver;
        this.player = player;
        this.gameMap = gameMap;
        calledCommand = new Drop();
        calledCommand.setGameMap(gameMap);
        calledCommand.setPlayer(player);
        calledCommand.setOutput(gameObserver);
    }

    public void takeInput(String command) {
        command = command.trim().toLowerCase();
        Command calledCommand = CommandFactory.createCommand(command);
        if(calledCommand != null) {
            calledCommand.execute();
            gameObserver.addHistory(command);
        }
        else{
            gameObserver.addOutput("Unknown command");
        }
    }

}
