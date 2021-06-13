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
    public void inGame() {
        currentRoom = player.getCurrentRoom();
        monster = currentRoom.getMonster();
        item =  player.getItem(argument);
        if(monster == null){
            output.add("There is nothing to attack");
        }
        else if(argument.equals("")){
            output.add("Attack with what?");
        }
        else if(item == null){
            output.add("You don't have that Item");
        }
        else{
            PlayerAttackMonster();
            MonsterAttackPlayer();
        }
        output.add("\n");
    }

    private void MonsterAttackPlayer() {
        output.add("The monster ");
        output.add(monster.getName());
        if(monster.isAlive()){
            int attack = monster.getAttackPower();
            player.setHp(player.getHp()- attack);
            output.add(" attacks you back with ");
            output.add(attack);
            output.add(" damage.");
        }
        else {

            currentRoom.setMonster(null);
            output.add(" is dead.");
            player.setAttackPower(player.getAttackPower()+2);
        }
    }

    private void PlayerAttackMonster() {

        int itemPower = item.use();
        int attack = itemPower+ player.getAttackPower();
        monster.setHP(monster.getHP()-attack);
        output.add("You have attacked the monster "+monster.getName());
        output.add(" with " );
        output.add(attack);
        output.add(" damage.");
    }
}
