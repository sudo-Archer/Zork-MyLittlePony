package game.command;

public class Help extends Command{
    @Override
    public void execute(){
        CommandEnum[] commandEnums = CommandEnum.values();
        for(CommandEnum command: commandEnums){
            output.add(command.getCommandManual()+"\n");
        }
    }
}
