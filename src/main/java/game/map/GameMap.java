package game.map;
import game.item.Item;
import game.monster.Monster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class GameMap {

    protected boolean running = true;

    public GameMap() {
        initialize();
        directionsSetup();
        itemSetup();
        monsterSetup();
    }

    protected abstract void initialize();

    protected abstract void directionsSetup();

    protected abstract void itemSetup();

    protected abstract void monsterSetup();

    public abstract Room getStartingRoom();

    public String getMap(){
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("./src/main/maps/GameMap.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (FileNotFoundException e) {
            stringBuilder.append("This game doesn't have a map");
        }

        return stringBuilder.toString();
    }

    public boolean isRunning(){
        return this.running;
    }

    public void stopGame(){ running = false;}
}
