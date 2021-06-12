package game.command;

import game.command.Info;
import game.command.Take;

public enum CommandEnum {

    INFO(Info.class, "info"),
    TAKE(Take.class, "take"),
    DROP(Drop.class, "drop"),
    ATTACK_WITH(AttackWith.class, "attack with");


    ;



    private Class commandClass;
    private String commandString;

    CommandEnum(Class commandClass, String commandString) {
        this.commandClass = commandClass;
        this.commandString = commandString;
    }
    public String getCommandString() {
        return commandString;
    }
    public Class getCommandClass() {
        return commandClass;
    }
}

