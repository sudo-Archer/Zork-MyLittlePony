package game.player;

import game.map.GameMap;
import game.map.Room;
import game.item.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    private Room currentRoom;
    private HashMap<String, Item> gameItems = new HashMap<>();
    private int hp;
    private int maxHp;
    private int attackPower;
    private boolean isAlive;

    public Player(GameMap gameMap, int maxHp, int attackPower) {
        this.currentRoom = gameMap.getStartingRoom();
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attackPower = attackPower;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(hp > this.maxHp){
           this.hp = maxHp;
        }
        if(hp < 1){
            isAlive = false;
        }
    }

    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public void addItem(Item item){
        this.gameItems.put(item.getItemName().toLowerCase(), item);
    }

    public Item getItem(String itemName){
        return gameItems.get(itemName);
    }

    public HashMap getAllItems(){
        return gameItems;
    }

    public boolean removeItem(String item){
        if(gameItems.get(item) == null){
            return false;
        }
        gameItems.remove(item);
        return true;

    }
    public String info(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Player info:\n");
        stringBuilder.append("HP: ");
        stringBuilder.append(hp);
        stringBuilder.append(" Attack-power: ");
        stringBuilder.append(attackPower+"\n");
        stringBuilder.append("Inventory: ");
        for(Map.Entry<String, Item> set: gameItems.entrySet()){
            stringBuilder.append(set.getKey()+", ");
        }
        return stringBuilder.toString();
    }
}
