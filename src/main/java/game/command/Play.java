package game.command;

import game.map.GameMapFactory;
import game.player.Player;

public class Play extends Command{
    @Override
    public void outGame() {
        gameMap = GameMapFactory.createGameMap(argument);
        if (gameMap != null){
            player = new Player(gameMap, 8, 2);
            gameObserver.addOutput(player.getCurrentRoom().info());
            gameObserver.setRecordHistory(true);
        }
        else {
            gameObserver.addOutput("There is no such map");

        }
    }
}
