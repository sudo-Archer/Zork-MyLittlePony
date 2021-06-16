package game.item;

import game.controls.MapObserver;
import game.player.Player;

import java.util.Random;

public class Item {

    protected String itemName;
    protected String itemDescription;
    protected Player player;
    protected Random random;


    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        random = new Random();
    }

    public void setPlayer(Player player){
        this.player = player;
        MapObserver.incrementItemTaken();
    }

    public String getItemName(){
        return  this.itemName;
    }
    public String getItemDescription(){
        return this.itemDescription;

    }

    public int use() {
        return 0;
    }

}
