package game.map;
import game.item.Item;
import game.monster.Monster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameMap {

    // Initialize rooms
    private Room startingRoom = new Room("Starting Room", "nothing");
    private Room up = new Room("UP", "its the north of the starting room");
    public GameMap() {
        directionsSetup();
        itemSetup();
        monsterSetup();
    }

    private void directionsSetup(){
        up.setRoom("south", startingRoom);
        startingRoom.setRoom("north", up);
    }
    private void itemSetup(){
        Item rock = new Item("Rock", "It dose nothing");
        startingRoom.setItem(rock);
    }
    private void monsterSetup(){
        Monster Pat = new Monster("Pat", "He is stupid", 3, 1);
        Monster Bell = new Monster("Bell", "This monster is lazy", 6, 2);
        up.setMonster(Bell);
        startingRoom.setMonster(Pat);
    }

    public Room getStartingRoom() {
        return startingRoom;
    }

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
}
