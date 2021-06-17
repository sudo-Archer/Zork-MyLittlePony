package game.map;
import game.controls.MapObserver;
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
    protected void howToWin() {
        MapObserver.clear();
        MapObserver.setWinningAmountOfMonsters(1);
    }

    @Override
    protected void initialize() {
        startingRoom = new Room("Starting Room", "nothing");
        up = new Room("UP", "its the north of the starting room");
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
        Monster Pat = new Monster("Pat", "He is stupid", 3, 1, 1);
        Monster Bell = new Monster("Bell", "This monster will kill you", 20, 0);


        up.setMonster(Bell);
        startingRoom.setMonster(Pat);
    }

    @Override
    public String mapName() {
        return "test";
    }


    @Override
    public Room getStartingRoom() {
        return startingRoom;
    }




}
