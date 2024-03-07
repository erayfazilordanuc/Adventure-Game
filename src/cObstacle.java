public class cObstacle {
    
    private String name;
    private int damage;
    private int health;
    private int maxHealth;
    private int criticalDamage;
    private int criticalRate;
    private int reward;

    public cObstacle(String name, int damage, int health, int criticalDamage, int criticalRate, int reward){

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHealth = health;
        this.criticalDamage = criticalDamage;
        this.criticalRate = criticalRate;
        this.reward = reward;

    }

    public int getReward(){

        return this.reward;

    }

    public void fullObstacleHealth(){

        setHealth(this.maxHealth);

    }

    public String getName(){

        return this.name;

    }

    public void setName(String name){

        this.name = name;

    }

    public int getDamage(){

        return this.damage;

    }

    public void setDamage(int damage){

        this.damage = damage;

    }

    public int getHealth(){

        return this.health;

    }

    public void setHealth(int health){

        this.health = health;

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
