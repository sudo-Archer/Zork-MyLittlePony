package game.controls;

import game.map.GameMap;

public class MapRunner {
    private static GameMap gameMap;

    public static void initialize(){
    }

    public static boolean isRunning(){
        return gameMap!=null;
    }

    public static void playerWin(){
        GameConsole.addOutput("Congratulations you have completed the map \n");
        quitMap();

    }

    public static void playerLost(){
        GameConsole.addOutput("GAME OVER \n");
        quitMap();
    }

    public static void quitMap(){
        gameMap = null;
    }

    public static GameMap getGameMap(){
        return gameMap;
    }
    public static void setGameMap(GameMap Map){
        gameMap = Map;
    }

}
