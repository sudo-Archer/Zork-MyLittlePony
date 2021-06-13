package game.command;
import game.Game;
import game.map.GameMap;
import game.player.Player;

public abstract class Command {
    protected String argument;
    protected static Player player;
    protected static GameMap gameMap;
    protected StringBuilder stringBuilder = new StringBuilder();

    public void setArgument(String argument) {
        this.argument = argument.trim();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setGameMap(GameMap gameMap){ this.gameMap = gameMap;}

    public GameMap getGameMap(){ return this.gameMap;}

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
