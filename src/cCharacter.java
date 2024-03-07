public class cCharacter {
    
    private String name;
    private int damage;
    private int health;
    private int money;
    private int criticalDamage;
    private int criticalRate;

    cCharacter(String name, int damage, int health, int money, int criticalDamage, int criticalRate){ // Add critical damage parameter

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.criticalDamage = criticalDamage;
        this.criticalRate = criticalRate;

    }

    public String getName(){

        return this.name;

    }

    public int getDamage(){

        return this.damage;

    }

    public int getHealth(){

        return this.health;

    }

    public int getMoney(){

        return this.money;

    }

    public int getCriticalDamage(){

        return this.criticalDamage;

    }

    public void setCriticalDamage(int damage){

        this.criticalDamage = damage;

    }

    public int getCriticalRate(){

        return this.criticalRate;

    }

    public void setCriticalRate(int damage){

        this.criticalRate = damage;

    }


}
