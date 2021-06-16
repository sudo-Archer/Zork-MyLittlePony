package game.command;

import game.controls.GameConsole;
import game.item.Item;
import game.map.Room;
import game.monster.Monster;

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
            GameConsole.addOutput("There is nothing to attack");
        }
        else if(argument.equals("")){
            GameConsole.addOutput("Attack with what?");
        }
        else if(item == null){
            GameConsole.addOutput("You don't have that Item");
        }
        else{
            PlayerAttackMonster();
            MonsterAttackPlayer();
        }
        GameConsole.addOutput("\n");
    }

    private void MonsterAttackPlayer() {
        GameConsole.addOutput("The monster ");
        GameConsole.addOutput(monster.getName());
        if(monster.isAlive()){
            int attack = monster.getAttackPower();
            GameConsole.addOutput(" attacks you back with ");
            GameConsole.addOutput(attack);
            GameConsole.addOutput(" damage. ");
            player.setHp(player.getHp()- attack);
        }
        else {

            currentRoom.setMonster(null);
            GameConsole.addOutput(" is dead.");
            player.setAttackPower(player.getAttackPower()+2);
        }
    }

    private void PlayerAttackMonster() {

        int itemPower = item.use();
        int attack = itemPower+ player.getAttackPower();
        monster.setHP(monster.getHP()-attack);
        GameConsole.addOutput("You have attacked the monster "+monster.getName());
        GameConsole.addOutput(" with " );
        GameConsole.addOutput(attack);
        GameConsole.addOutput(" damage.");
    }
}
