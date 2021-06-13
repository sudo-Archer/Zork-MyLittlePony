package game.command;

import game.item.Item;
import game.map.Room;

public class Take extends Command {


    @Override
    public void action() {
        Room curRoom = player.getCurrentRoom();
        Item roomItem = curRoom.getItem();
        if(roomItem != null){
           output.add("you have picked up ");
           output.add(roomItem.getItemName());
           output.add(". Item info: ");
           output.add(roomItem.getItemDescription());
           output.add("\n");

           player.addItem(roomItem);
           curRoom.setItem(null);

        }
        else {
            output.add("No item to take \n");

        }


    }

}
