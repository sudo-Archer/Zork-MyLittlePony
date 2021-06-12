package game;

import game.Output;
import game.command.Command;
import game.command.CommandFactory;
import game.player.Player;

public class CommandParser {

    Output output;
    Player player;

    public CommandParser(Output output, Player player) {
        this.output = output;
        this.player = player;
    }

    public void takeInput(String command) {
        command = command.trim().toLowerCase();
        Command calledCommand = CommandFactory.createCommand(command);
        if(calledCommand != null) {
            calledCommand.setPlayer(player);
            calledCommand.action();
            output.add(calledCommand.output());
        }
        else{
            output.add("Unknown command");
        }
    }

}
