package game.command;

import game.item.Item;
import game.map.Room;
import game.monster.Monster;
import game.player.Player;

public class AttackWith extends Command {

    Monster monster;
    Item item;
    Room currentRoom;

    @Override
    public void action() {
        currentRoom = player.getCurrentRoom();
        monster = currentRoom.getMonster();
        item =  player.getItem(argument);
        if(monster == null){
            stringBuilder.append("There is nothing to attack");
        }
        else if(argument.equals("")){
            stringBuilder.append("Attack with what?");
        }
        else if(item == null){
            stringBuilder.append("You don't have that Item");
        }
        else{
            PlayerAttackMonster();
            MonsterAttackPlayer();
        }
    }

    private void MonsterAttackPlayer() {
        stringBuilder.append("The monster ");
        stringBuilder.append(monster.getName());
        if(monster.isAlive()){
            int attack = monster.getAttackPower();
            player.setHp(player.getHp()- attack);
            stringBuilder.append(" attacks you back with ");
            stringBuilder.append(attack);
            stringBuilder.append(" damage.");
        }
        else {

            currentRoom.setMonster(null);
            stringBuilder.append("is dead.");
            player.setAttackPower(player.getAttackPower()+2);
        }
    }

    private void PlayerAttackMonster() {

        int itemPower = item.use();
        int attack = itemPower+ player.getAttackPower();
        monster.setHP(monster.getHP()-attack);
        stringBuilder.append("You have attacked the monster "+monster.getName());
        stringBuilder.append(" with " );
        stringBuilder.append(attack);
        stringBuilder.append(" damage.");
    }
}
