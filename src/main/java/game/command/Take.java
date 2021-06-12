package game.command;

import game.item.Item;
import game.map.Room;

public class Take extends Command {


    @Override
    public void action() {
        Room curRoom = player.getCurrentRoom();
        Item roomItem = curRoom.getItem();
        if(roomItem != null){
           stringBuilder.append("you have picked up ");
           stringBuilder.append(roomItem.getItemName());
           stringBuilder.append(". Item info: ");
           stringBuilder.append(roomItem.getItemInfo());

           player.addItem(roomItem);
           curRoom.setItem(null);
        }
        else {
            stringBuilder.append("No item to take");
        }


    }

}
