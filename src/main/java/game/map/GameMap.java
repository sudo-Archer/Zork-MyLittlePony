package game.map;

import game.item.Item;
import game.monster.Monster;

public class GameMap {

    private Room startingRoom = new Room("Starting Room", "nothing");

    public GameMap() {
        Room up = new Room("UP", "its the north of the starting room");
        Item rock = new Item("Rock", "It dose nothing");
        Monster Pat = new Monster("Pat", "He is stupid", 3, 1);
        Monster Bell = new Monster("Bell", "This monster is lasy", 6, 2);
        startingRoom.setRoom("north", up);
        up.setRoom("south", startingRoom);
        up.setMonster(Bell);
        startingRoom.setItem(rock);
        startingRoom.setMonster(Pat);
    }

    public Room getStartingRoom() {
        return startingRoom;
    }
}
