package game.command;

import game.map.Room;

public class Go extends Command{

    @Override
    public void inGame() {
        Room currentRoom = player.getCurrentRoom();
        Room nextRoom = currentRoom.getRoom(argument);
        if(nextRoom == null){
            gameObserver.addOutput("You can't go what way");
        }
        else{
            player.setCurrentRoom(nextRoom);
            gameObserver.addOutput(nextRoom.info());
        }

    }
}
