package game.command;
import game.player.Player;

public abstract class Command {
    protected String argument;
    protected Player player;
    protected StringBuilder stringBuilder = new StringBuilder();

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
    public String output(){
        return stringBuilder.toString();
    }

}
