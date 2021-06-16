package game.command;

import game.controls.GameConsole;
import game.item.Item;
import game.map.Room;

public class Take extends Command {


    @Override
    public void inGame() {
        Room curRoom = player.getCurrentRoom();
        Item roomItem = curRoom.getItem();
        if(roomItem != null){
           GameConsole.addOutput("you have picked up ");
           GameConsole.addOutput(roomItem.getItemName());
           GameConsole.addOutput(". Item info: ");
           GameConsole.addOutput(roomItem.getItemDescription());
           GameConsole.addOutput("\n");

           player.addItem(roomItem);
           curRoom.setItem(null);

        }
        else {
            GameConsole.addOutput("No item to take \n");

        }


    }

}
