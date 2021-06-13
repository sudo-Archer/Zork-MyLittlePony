package game.command;

public class CommandMap extends Command{
    @Override
    public void action() {
        output.add(gameMap.getMap());
    }
}
