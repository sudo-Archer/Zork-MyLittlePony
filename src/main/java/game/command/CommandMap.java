package game.command;

public class CommandMap extends Command{
    @Override
    public void inGame() {
        output.add(gameMap.getMap());
    }
}
