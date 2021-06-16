package game.item;

import game.controls.MapObserver;
import game.player.Player;

public class Token extends Item{
    public Token(String itemName, String itemDescription) {
        super(itemName, itemDescription);
    }

    @Override
    public void setPlayer(Player player){
        this.player = player;
        MapObserver.incrementTokenTaken();
    }

    @Override
    public String getItemDescription(){
        return itemDescription+"(You need you collect more Tokes to win the game)";
    }

}
