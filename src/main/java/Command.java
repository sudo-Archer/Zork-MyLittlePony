public abstract class Command {
    protected String argument;
    protected Player player;

    public void setArgument(String argument) {
        this.argument = argument.trim();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getArgument() {
        return argument;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract void action();
    public abstract String output();

}
