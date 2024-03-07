import java.util.Scanner;

public class mGame {

    public void start(){

        Scanner in7 = new Scanner(System.in);
        boolean state = true;

        while(state == true){

        System.out.println("\nWelcome to the adventure game");
        System.out.print("\nPlease enter your name : ");
        String name = in7.nextLine();

        cPlayer player = new cPlayer();

        player.setInventory();

        player.setName(name);

        cCharacter Samurai = new cCharacter("Samurai", 45, 125, 200, 75, 35);
        cCharacter Archer = new cCharacter("Archer", 35, 110, 250, 60, 30);
        cCharacter Knight = new cCharacter("Knight", 55, 150, 150, 85, 40);

        System.out.print("\nPlease choose your character:\n1-Samurai   / Damage : 45 / Health : 125 / Money : 200 / Critical damage : 75 / Critical rate : %15\n2-Archer    / Damage : 35 / Health : 110 / Money : 250 / Critical damage : 60 / Critical rate : %10\n3-Knight    / Damage : 55 / Health : 150 / Money : 150  / Critical damage : %85 / Critical rate : 20\nYour choice : ");
        Scanner in5 = new Scanner(System.in);
        int choiceId = in5.nextInt();

        switch(choiceId){
            case 1 : player.setCharacter(Samurai);
            break;
            case 2 : player.setCharacter(Archer);
            break;
            case 3 : player.setCharacter(Knight);
            break;
            default : System.out.println("\nOut of range");
        }

        player.allInfo();

        pHome home = new pHome(player);

        pToolStore toolStore = new pToolStore(player);

        cObstacle obstacle = new cObstacle("Vampire", 50, 200, 75, /* % */ 45, 100);

        cObstacle obstacle2 = new cObstacle("Ecinli", 70, 175, 100, /* % */ 35, 100);

        cObstacle obstacle3 = new cObstacle("Snake", 40, 275, 75, /* % */ 45, 100);

        pForest forest = new pForest(player, "Forest", obstacle, obstacle2);

        pCave cave = new pCave(player, "Cave", obstacle3, obstacle2);

        pRiver river = new pRiver(player, "River", obstacle3, obstacle);

        boolean state2 = true;

        while(state2 == true){
        
        System.out.print("\nChoose the place you want to go:\n1-Home\n2-Tool Store\n3-Forest\n4-Cave\n5-River\nYour choice : ");
        Scanner in6 = new Scanner(System.in);
        int choiceLocation = in6.nextInt();

        switch(choiceLocation){

            case 1 : forest.offLocation(); toolStore.offLocation(); river.offLocation(); cave.offLocation(); home.onLocation();  
            break;
            case 2 : home.offLocation(); forest.offLocation(); toolStore.onLocation(); river.offLocation(); cave.offLocation();  
            break;
            case 3 : toolStore.offLocation(); home.offLocation(); forest.onLocation(); river.offLocation(); cave.offLocation();
            break;
            case 4 : toolStore.offLocation(); home.offLocation(); forest.offLocation(); river.offLocation(); cave.onLocation();
            break;
            case 5 : toolStore.offLocation(); home.offLocation(); forest.offLocation(); river.onLocation(); cave.offLocation();
            break;
            default : System.out.println("\nOut of range");

        }

    }
    
        state = false;

    }

    }
    
}
