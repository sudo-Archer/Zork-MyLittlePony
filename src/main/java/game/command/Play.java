package game.command;

import game.controls.GameConsole;
import game.controls.GameHistory;
import game.map.GameMapFactory;
import game.player.Player;

public class Play extends Command{
    @Override
    public void outGame() {
        gameMap = GameMapFactory.createGameMap(argument);
        if (gameMap != null){
            player = new Player(gameMap, 8, 2);
            GameConsole.addOutput(player.getCurrentRoom().info());
            GameHistory.startRecordHistory();
        }
        else {
            GameConsole.addOutput("There is no such map");

        }
    }
}
