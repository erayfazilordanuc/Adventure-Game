import java.util.Scanner;

public class pHome extends pLocation{

    String name = "Home";
    
    pHome(cPlayer player){

        super(player);

    }

    public boolean getLocationState(){

        return locationState;

    }

    public void setLocationState(boolean locationState){

        this.locationState = locationState;

    }

    @Override
    public void onLocation(){

        if(this.locationState==true){
            System.out.println("\nYou are already at Home");
        }else{
        this.locationState = true;
        System.out.println("\nYou have reached the home");
        boolean state = true;
        while(state==true){
        System.out.print("\nChoose the action do you want to do:\n1-Refill the health\n2-See info of your character\n3-Exit the home\nYour choice : ");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        
        
        switch(c){

            case 1 : if(player.getHealth()<player.getMaxHealth()){
            this.player.setHealth(player.getMaxHealth());
            System.out.println("\nYour health has fulled");
            }else{System.out.println("\nYour health already fulled");} break;
            case 2 : if(player.getHealth()<0){player.setHealth(0);}player.allInfo();
            break;
            case 3 : offLocation(); state = false; 
            break;

        }
    }

    }

    }

    @Override
    public void offLocation(){

        if(this.locationState == true){
        System.out.println("\nYou have leaved the Home");
        this.locationState = false;}

    }

    public String getName(){

        return this.name;

    }

    public void setName(String name){

        this.name = name;

    }

}
