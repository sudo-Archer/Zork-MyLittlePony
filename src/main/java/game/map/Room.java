package game.map;

import game.item.Item;
import game.monster.Monster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static javax.swing.UIManager.put;

public class Room {

    private String roomName;
    private String roomDescription;
    private Item item = null;
    private Monster monster = null;
    private HashMap<String, Room> directionsToOtherRooms = new HashMap<>();
    private static Set<String> directions = new HashSet<>();




    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        directions.add("north");
        directions.add("south");
        directions.add("east");
        directions.add("west");
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public Item getItem(){
        return item;
    }

    public void setRoom(String dir, Room room) {
        if(!directions.contains(dir)){
            throw new IllegalArgumentException("Direction Unknown");
        }
        directionsToOtherRooms.put(dir, room);
    }

    public Room getRoom(String dir){
        return directionsToOtherRooms.get(dir);
    }

    public String getRoomName() {
        return roomName;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster){
        this.monster = monster;
    }

    public String info(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("You are in "+roomName+". ");
        stringBuilder.append("You see " + roomDescription+"\n");
        if(item!= null){
            stringBuilder.append("There is an Item "+item.getItemName()+" in this room. ");
        }
        if(monster != null){
            stringBuilder.append("There is a Monster in this room. \n");
            stringBuilder.append(monster.info()+"\n");
        }
        return stringBuilder.toString();

    }
}
