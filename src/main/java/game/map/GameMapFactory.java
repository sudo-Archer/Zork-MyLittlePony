package game.map;

public class GameMapFactory {

    public static GameMap createGameMap(String string){
        GameMapEnum[] gameMapEnums = GameMapEnum.values();
        for(GameMapEnum map: gameMapEnums){
            if(string.equals(map.getMapName())){
                try {
                    GameMap gameMap = (GameMap) map.getMapClass().newInstance();
                    return gameMap;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
