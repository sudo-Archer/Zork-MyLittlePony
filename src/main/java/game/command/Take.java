package game.command;

import game.item.Item;
import game.map.Room;

public class Take extends Command {


    @Override
    public void inGame() {
        Room curRoom = player.getCurrentRoom();
        Item roomItem = curRoom.getItem();
        if(roomItem != null){
           gameObserver.addOutput("you have picked up ");
           gameObserver.addOutput(roomItem.getItemName());
           gameObserver.addOutput(". Item info: ");
           gameObserver.addOutput(roomItem.getItemDescription());
           gameObserver.addOutput("\n");

           player.addItem(roomItem);
           curRoom.setItem(null);

        }
        else {
            gameObserver.addOutput("No item to take \n");

        }


    }

}
