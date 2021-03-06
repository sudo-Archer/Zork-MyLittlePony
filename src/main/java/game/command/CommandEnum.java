package game.command;
public enum CommandEnum {

    INFO(Info.class, "info", "info- This command givens basic information about the player and the current room they are in."),
    TAKE(Take.class, "take", "take- This command is used to pick up the item in the current room."),
    DROP(Drop.class, "drop", "drop [item]- Drops item of choice from the player's inventory."),
    ATTACK_WITH(AttackWith.class, "attack with", "attack with [item]- Attacks monster in the current room with the item fo choice."),
    GO(Go.class, "go", "go [direction]- Move player to the room as specified by the direction, e.g. north, east, west, south."),
    MAP(CommandMap.class, "map", "map- Display a 2D map using ascii art."),
    AUTOPILOT(Autopilot.class, "autopilot", "autopilot [file]- Run this game in autopilot mode using the list of command in the file"),
    HELP(Help.class, "help", "help- Print all commands and its uses."),
    PLAY(Play.class, "play", "play [map]- Start playing the map."),
    QUIT(Quit.class, "quit", "quit- quit the current game"),
    EXIT(Exit.class, "exit", "exit- exit form Zork adventure."),
    SAVE(Save.class, "save", "save [save-name]- save the game-state]"),
    LOAD(Load.class, "load", "load [save-name]- load game state from saved point"),


    ;



    private final Class commandClass;
    private final String commandString;
    private final String commandManual;

    CommandEnum(Class commandClass, String commandString, String commandManual) {
        this.commandClass = commandClass;
        this.commandString = commandString;
        this.commandManual = commandManual;
    }
    public String getCommandString() {
        return commandString;
    }
    public String getCommandManual(){ return commandManual;}
    public Class getCommandClass() {
        return commandClass;
    }

}

