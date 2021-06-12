package game.map;

import game.item.Item;

public class GameMap {

    private Room startingRoom = new Room("String game.map.Room", "a play where you start");

    public GameMap() {
        Room up = new Room("UP", "its the north of the starting room");
        startingRoom.setNorth(up);
        Item rock = new Item("Rock", "It dose nothing");
        startingRoom.setItem(rock);

    }

    public Room getStartingRoom() {
        return startingRoom;
    }
}
