package game.command;

public class CommandMap extends Command{
    @Override
    public void action() {
        stringBuilder.append(gameMap.getMap());
    }
}
