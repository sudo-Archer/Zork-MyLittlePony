package game.command;

import game.map.Room;

public class Go extends Command{

    @Override
    public void action() {
        Room currentRoom = player.getCurrentRoom();
        Room nextRoom = currentRoom.getRoom(argument);
        if(nextRoom == null){
            stringBuilder.append("You can't go what way");
        }
        else{
            player.setCurrentRoom(nextRoom);
            stringBuilder.append(nextRoom.info());
        }

    }
}
