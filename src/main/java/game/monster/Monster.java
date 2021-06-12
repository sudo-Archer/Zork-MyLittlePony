package game.monster;

public class Monster {
    protected String name;
    protected String description;
    protected int HP;
    protected int attackPower;
    protected boolean isAlive;


    public Monster(String name, String description, int HP, int attackPower) {
        this.name = name;
        this.description = description;
        this.HP = HP;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getDescription() {
        return description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHP(int HP) {
        this.HP = HP;
        isAlive = HP>0;
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
