package game;

import game.Output;
import game.command.Command;
import game.command.CommandFactory;
import game.command.Drop;
import game.map.GameMap;
import game.player.Player;

public class CommandParser {

    private Output output;
    private Player player;
    private GameMap gameMap;
    private Command calledCommand;

    public CommandParser(Output output, Player player, GameMap gameMap) {
        this.output = output;
        this.player = player;
        this.gameMap = gameMap;
        calledCommand = new Drop();
        calledCommand.setGameMap(gameMap);
        calledCommand.setPlayer(player);
        calledCommand.setOutput(output);
    }

    public void takeInput(String command) {
        command = command.trim().toLowerCase();
        Command calledCommand = CommandFactory.createCommand(command);
        if(calledCommand != null) {
            calledCommand.execute();
        }
        else{
            output.add("Unknown command");
        }
    }

}
