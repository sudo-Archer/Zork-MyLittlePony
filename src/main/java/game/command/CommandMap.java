package game.command;
import game.controls.GameConsole;

public class CommandMap extends Command{
    @Override
    public void inGame() {
        GameConsole.addOutput(gameMap.getMap());
    }
}
