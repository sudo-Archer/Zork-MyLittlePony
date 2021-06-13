package game.map;
import game.item.Item;
import game.monster.Monster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingMap extends GameMap {

    // Initialize rooms
    protected Room startingRoom;
    protected Room up;

    @Override
    protected void initialize() {
        startingRoom = new Room("Starting Room", "nothing");
        up = new Room("UP", "its the north of the starting room");
        System.out.println("hit");
    }

    @Override
    protected void directionsSetup(){
        startingRoom.setRoom("north", up);
        up.setRoom("south", startingRoom);
    }

    @Override
    protected void itemSetup(){
        Item rock = new Item("Rock", "It dose nothing");
        startingRoom.setItem(rock);
    }

    @Override
    protected void monsterSetup(){
        Monster Pat = new Monster("Pat", "He is stupid", 3, 1);
        Monster Bell = new Monster("Bell", "This monster is lazy", 6, 2);
        up.setMonster(Bell);
        startingRoom.setMonster(Pat);
    }


    @Override
    public Room getStartingRoom() {
        return startingRoom;
    }

    @Override
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
