package game.command;

import game.controls.GameConsole;
import game.map.Room;

public class Go extends Command{

    @Override
    public void inGame() {
        Room currentRoom = player.getCurrentRoom();
        Room nextRoom = currentRoom.getRoom(argument);
        if(nextRoom == null){
            GameConsole.addOutput("You can't go what way");
        }
        else{
            player.setCurrentRoom(nextRoom);
            GameConsole.addOutput(nextRoom.info());
            player.setHp(player.getHp()+2);
        }

    }
}
