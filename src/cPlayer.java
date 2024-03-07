public class cPlayer {

    private String name;
    private int damage;
    private int health;
    private int money;
    private int maxHealth;
    private int criticalDamage;
    private int criticalRate;
    String weaponName;
    String armorName;
    cCharacter character;
    iInventory inventory;

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

    public int getMoney(){

        return this.money;

    }

    public void setMoney(int money){
        
        this.money = money;

    }

    public int getMaxHealth(){

        return this.maxHealth;

    }

    public void setMaxHealth(int maxHealth){
        
        this.maxHealth = maxHealth;

    }

    public void allInfo(){

        System.out.println("\nPlayer you made" + "\nName : " + this.name + "\nCharacter : " + character.getName() + "\nDamage : " + this.damage + "\nHealth : " + this.health + "\nMoney : " + this.money + "\nCritical damage : " + this.criticalDamage + "\nCritical rate : %" + this.criticalRate + "\nWeapon : " + getWeaponName() + "\nArmor : " + getArmorName());

    }

    public void setCharacter(cCharacter c){

        this.character = c;
        setDamage(c.getDamage());
        setHealth(c.getHealth());
        setMoney(c.getMoney());
        setMaxHealth(c.getHealth());
        setCriticalDamage(c.getCriticalDamage());
        setCriticalRate(c.getCriticalRate());
    }

    public void setInventory(){

        iInventory inventory = new iInventory("Inventory");
        this.inventory = inventory;
        this.weaponName = inventory.getWeaponName();
        this.armorName = inventory.getArmorName();

    }

    public void setInventoryArmorDefence(int armorDefence){

        this.inventory.setArmorDefence(armorDefence);

    }

    public void setInventoryWeaponDamage(int weaponDamage){

        this.inventory.setWeaponDamage(weaponDamage);

    }

    public void setInventoryArmorName(String armorName){

        this.inventory.setArmorName(armorName);

    }

    public void setInventoryWeaponName(String weaponName){

        this.inventory.setWeaponName(weaponName);

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

    public String getWeaponName(){

        return this.weaponName;

    }

    public void setWeaponName(String weaponName){

        this.weaponName = weaponName;

    }

    public String getArmorName(){

        return this.armorName;

    }

    public void setArmorName(String armorName){

        this.armorName = armorName;

    }

}
