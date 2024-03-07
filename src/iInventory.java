public class iInventory {

    String name;
    boolean water;
    boolean food;
    boolean fireWoord;
    String weaponName = "";
    String armorName = "";
    int weaponDamage;
    int armorDefence;

    public iInventory(String name){
        
        this.name = name;

    }

    public int getWeaponDamage(){

        return this.weaponDamage;

    }

    public void setWeaponDamage(int weaponDamage){

        this.weaponDamage = weaponDamage; 

    }

    public int getArmorDefence(){

        return this.armorDefence;

    }

    public void setArmorDefence(int armorDefence){

        this.armorDefence = armorDefence; 

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

    public boolean getWater(){

    return this.water;

    }

    public void setWater(boolean water){

        this.water = water;
    
    }

    public boolean getFood(){

    return this.food;

    }

    public void setFood(boolean food){

        this.food = food;
    
    }

    public boolean getFireWoord(){

    return this.fireWoord;

    }

    public void setFireWoord(boolean fireWoord){

        this.fireWoord = fireWoord;
    
    }
    
}
