package game.monster;

public class Monster {
    protected String name;
    protected String info;
    protected int HP;
    protected int attackPower;
    protected boolean isAlive;


    public Monster(String name, String info, int HP, int attackPower) {
        this.name = name;
        this.info = info;
        this.HP = HP;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getInfo() {
        return info;
    }

    public int getHP() {
        return HP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setHP(int HP) {
        this.HP = HP;
        isAlive = HP>0;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
