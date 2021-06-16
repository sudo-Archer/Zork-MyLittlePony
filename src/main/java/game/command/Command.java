package game.command;
import game.controls.GameConsole;
import game.map.GameMap;
import game.player.Player;

public abstract class Command {
    protected String argument;
    protected static Player player;
    protected static GameMap gameMap;

    public void setArgument(String argument) {
        this.argument = argument.trim();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setGameMap(GameMap gameMap){ this.gameMap = gameMap;}

    public GameMap getGameMap(){ return this.gameMap;}

    public Player getPlayer() {
        return player;
    }

    protected void inGame(){
        GameConsole.addOutput("You must quit this game to use this command. \n");
    }
    protected void outGame(){
        GameConsole.addOutput("You must play a map to use this command. \n");
    }

    protected boolean playingGame(){ return gameMap != null&& player != null;}

    public void execute(){
        if(playingGame()){
            inGame();
        }else{
            outGame();
        }
    }

}
