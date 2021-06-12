public class Room {

    private String roomName;
    private String roomDescription;
    private Weapon Weapon = null;
    private Room North = null;
    private Room South = null;
    private Room West = null;
    private Room East = null;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    public void setNorth(Room north) {
        North = north;
    }

    public void setSouth(Room south) {
        South = south;
    }

    public void setWest(Room west) {
        West = west;
    }

    public void setEast(Room east) {
        East = east;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Weapon getWeapon() {
        return Weapon;
    }

    public Room getNorth() {
        return North;
    }

    public Room getSouth() {
        return South;
    }

    public Room getWest() {
        return West;
    }

    public Room getEast() {
        return East;
    }


}
