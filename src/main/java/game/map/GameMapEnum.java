package game.map;
public enum GameMapEnum {
    TESTING(TestingMap.class, "test", "this is just a drill."),
    ;

    private String mapName;
    private String aboutThisMap;
    private Class mapClass;

    public String getMapName() {
        return mapName;
    }

    public String getAboutThisMap() {
        return aboutThisMap;
    }

    public Class getMapClass() {
        return mapClass;
    }

    GameMapEnum(Class mapClass, String mapName, String aboutThisMap) {
        this.mapName = mapName;
        this.aboutThisMap = aboutThisMap;
        this.mapClass = mapClass;
    }
}
