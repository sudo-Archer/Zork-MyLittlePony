package game.command;

import game.command.Command;
import game.command.CommandEnum;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {



    private static HashMap<String, Class> commandMap = new HashMap<>(){{
        CommandEnum[] commandEnums = CommandEnum.values();
        for(int i=0; i<commandEnums.length; i++){
            put(commandEnums[i].getCommandString(), commandEnums[i].getCommandClass());
        }
    }};

    public static Command createCommand(String command) {

        String commandString;
        for (Map.Entry<String, Class> set : commandMap.entrySet()){
            commandString = set.getKey();

            if (commandString.length() <= command.length() && commandString.equals(command.substring(0,commandString.length()))){
                try {
                    Command calledCommand = (Command) set.getValue().newInstance();
                    calledCommand.setArgument(command.substring(commandString.length(), command.length()));
                    return calledCommand;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }

       return null;
    }
}
