package game.command;

public class CommandMap extends Command{
    @Override
    public void inGame() {
        gameObserver.addOutput(gameMap.getMap());
    }
}
