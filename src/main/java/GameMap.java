public class GameMap {

    private Room startingRoom = new Room("String Room", "a play where you start");

    public GameMap() {
        Room up = new Room("UP", "its the north of the starting room");
        startingRoom.setNorth(up);

    }

    public Room getStartingRoom() {
        return startingRoom;
    }
}
