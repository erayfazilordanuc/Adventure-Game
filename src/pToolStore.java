import java.util.Scanner;

public class pToolStore extends pLocation {

    String name = "Tool Store";
    
    pToolStore(cPlayer player){

        super(player);

    }

    public void menu(){

        boolean s = true;
        while(s==true){
        Scanner in = new Scanner(System.in);
        System.out.print("\nChoose the action do you want to do:\n1-Buy Weapons\n2-Buy Armors\n3-Exit\nYour choice : ");
        int choice = in.nextInt();

        System.out.println("\nYour budget : " + player.getMoney());

        switch(choice){

            case 1 : System.out.print("\n1-Shotgun   / Damage : 70 / Price : 150\n2-Rifle   / Damage : 55 / Price : 125\n3-Pistol   / Damage : 40 / Price : 100\nYour choice : ");
            Scanner in4 = new Scanner(System.in);
            int weapon = in4.nextInt();

            switch(weapon){

                case 1 : if(player.getMoney()<150){System.out.println("You dont have enough money");}else{player.setMoney(player.getMoney()-150);
                player.setInventoryWeaponDamage(70); player.setDamage(player.getDamage() + 70); player.setInventoryWeaponName("Shotgun"); player.setWeaponName("Shotgun");
            break;
            }
                case 2 : if(player.getMoney()<125){System.out.println("You dont have enough money");}else{player.setMoney(player.getMoney()-125);
                    player.setInventoryWeaponDamage(55); player.setDamage(player.getDamage() + 55); player.setInventoryWeaponName("Rifle"); player.setWeaponName("Rifle");
                break;
                }
                case 3 : if(player.getMoney()<100){System.out.println("You dont have enough money");}else{player.setMoney(player.getMoney()-100);
                    player.setInventoryWeaponDamage(40); player.setDamage(player.getDamage() + 40); player.setInventoryWeaponName("Pistol"); player.setWeaponName("Pistol");
                break;
                }
                default : System.out.println("\nOut of range");

            }

            break;
            case 2 : System.out.print("\n1-Shield   / Defense : 50 / Price : 110\n2-Vest   / Defense : 35 / Price : 75\nYour choice : "); 
            Scanner in3 = new Scanner(System.in);
            int armor = in3.nextInt();

            switch(armor){

                case 1 : if(player.getMoney()>=110){player.setMoney(player.getMoney()-110);
                    player.setInventoryArmorDefence(50); player.setMaxHealth(player.getHealth() + 50); player.setInventoryArmorName("Shield"); player.setArmorName("Shield");
                }else{System.out.println("\nYou dont have enough money"); 
            }break;
                case 2 : if(player.getMoney()>=75){player.setMoney(player.getMoney()-75);
                    player.setInventoryArmorDefence(35); player.setMaxHealth(player.getHealth() + 35); player.setInventoryArmorName("Vest"); player.setArmorName("Vest");
                }else{System.out.println("\nYou dont have enough money");
            }break;

            }

            break;
            case 3 : s = false; break;
            default : System.out.println("\nOut of range");
        }

    }

}

    public boolean getLocationState(){

        return locationState;

    }

    public void setLocationState(boolean locationState){

        this.locationState = locationState;

    }
    
    @Override
    public void onLocation(){

        if(locationState==true){
            System.out.println("\nYou are already at Tool Store");
            menu();
        }else{
        locationState = true;
        System.out.println("\nYou have reached the Tool Store");
        menu();

        }
    }

    @Override
    public void offLocation(){

        if(this.locationState == true){
        System.out.println("\nYou have leaved the Tool Store");
        this.locationState = false;}

    }
}
