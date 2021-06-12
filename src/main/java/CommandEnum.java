public enum CommandEnum {

    INFO(Info.class, "info");

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

