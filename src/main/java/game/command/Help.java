package game.command;

import game.controls.GameConsole;

public class Help extends Command{
    @Override
    public void execute(){
        CommandEnum[] commandEnums = CommandEnum.values();
        for(CommandEnum command: commandEnums){
            GameConsole.addOutput(command.getCommandManual()+"\n");
        }
    }
}
