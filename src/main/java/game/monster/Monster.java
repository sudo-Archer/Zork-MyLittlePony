package game.monster;

import game.controls.GameConsole;
import game.controls.MapObserver;

import java.util.Random;

public class Monster {
    protected String name;
    protected String description;
    protected int HP;
    protected int attackPower;
    protected boolean isAlive;
    protected int maxAttackPower;
    protected Random random;

    public Monster(String name, String description, int HP, int attackPower, int maxAttackPower){
        this.name = name;
        this.description = description;
        this.HP = HP;
        this.attackPower = attackPower;
        this.isAlive = true;
        this.maxAttackPower = maxAttackPower;
        this.random = new Random();
    }
    public Monster(String name, String description, int HP, int attackPower) {
        this.name = name;
        this.description = description;
        this.HP = HP;
        this.attackPower = attackPower;
        this.isAlive = true;
        this.maxAttackPower = attackPower;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void isDead() {
       // what to do now?
        MapObserver.incrementMonstersKilled();
        GameConsole.addOutput(name+" is dead.");
    }

    public String getDescription() {
        return description;
    }

    public int getHP() {
        return HP;
    }

    public int getAttackPower() {
        return attackPower + randomAttack();
    }

    private int randomAttack(){
        return random.nextInt(maxAttackPower - attackPower+1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHP(int HP) {
        this.HP = HP;
        if (HP < 0){
            isDead();
        }
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String info(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Monster Name: "+name+" ,Info: "+description+"\n");
        stringBuilder.append("HP: ");
        stringBuilder.append(HP);
        stringBuilder.append(" Attack-power: ");
        stringBuilder.append(attackPower);
        return stringBuilder.toString();

    }
}
