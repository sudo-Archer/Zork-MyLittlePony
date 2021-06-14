package game.command;

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
            gameObserver.addOutput("There is nothing to attack");
        }
        else if(argument.equals("")){
            gameObserver.addOutput("Attack with what?");
        }
        else if(item == null){
            gameObserver.addOutput("You don't have that Item");
        }
        else{
            PlayerAttackMonster();
            MonsterAttackPlayer();
        }
        gameObserver.addOutput("\n");
    }

    private void MonsterAttackPlayer() {
        gameObserver.addOutput("The monster ");
        gameObserver.addOutput(monster.getName());
        if(monster.isAlive()){
            int attack = monster.getAttackPower();
            player.setHp(player.getHp()- attack);
            gameObserver.addOutput(" attacks you back with ");
            gameObserver.addOutput(attack);
            gameObserver.addOutput(" damage.");
        }
        else {

            currentRoom.setMonster(null);
            gameObserver.addOutput(" is dead.");
            player.setAttackPower(player.getAttackPower()+2);
        }
    }

    private void PlayerAttackMonster() {

        int itemPower = item.use();
        int attack = itemPower+ player.getAttackPower();
        monster.setHP(monster.getHP()-attack);
        gameObserver.addOutput("You have attacked the monster "+monster.getName());
        gameObserver.addOutput(" with " );
        gameObserver.addOutput(attack);
        gameObserver.addOutput(" damage.");
    }
}
