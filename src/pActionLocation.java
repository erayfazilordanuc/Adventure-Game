import java.util.Scanner;

public abstract class pActionLocation extends pLocation{

    cObstacle obstacle;
    cObstacle obstacle2;
    String name;
    long random;

    pActionLocation(cPlayer player, String name, cObstacle obstacle, cObstacle obstacle2){

        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.obstacle2 = obstacle2;

    }
    
    private long expo(int a,int b){
        long cons=1;
        if(a==0||b==0)
            cons=0;
        for(;b>0;b--)
            cons*=a;
        return cons;}

    public long randomNumber(){
        long instantime = System.currentTimeMillis();
        long a=1664595L,c=1013907223L,m=expo(2,32);
        instantime=((a*instantime+c)%m)%10;
        return instantime;
    }

    public long percentRandomNumber(){
        long instantime = System.currentTimeMillis();
        long a=1664725L,c=1013900223L,m=expo(2,32);
        instantime=((a*instantime+c)%m)%100;
        return instantime;
    }

    public long percentRandomNumber2(){
        long instantime = System.currentTimeMillis();
        long a=1664525L,c=1013904423L,m=expo(2,32);
        instantime=((a*instantime+c)%m)%100;
        return instantime;
    }

    public long percentRandomNumber3(){
        long instantime = System.currentTimeMillis();
        long a=1664925L,c=1016904223L,m=expo(2,32);
        instantime=((a*instantime+c)%m)%100;
        return instantime;
    }

    public long percentRandomNumber4(){
        long instantime = System.currentTimeMillis();
        long a=1664529L,c=1013904221L,m=expo(2,32);
        instantime=((a*instantime+c)%m)%100;
        return instantime;
    }


    public void damageToObstacle(cObstacle o){ // Player obstacle a hasar veriyor

        o.setHealth(o.getHealth() - player.getDamage());

    }

    public void damageToPlayer(cObstacle o){ // Obstacle player a hasar veriyor
 
        player.setHealth(player.getHealth() - o.getDamage());

    }

    public void combat(cObstacle o){

        System.out.println("\nYour health : " + player.getHealth());

        System.out.println("\nYour opponents health : " + o.getHealth() + "\n");

        if(this.random<5){ // Başlayan kişiyi belirleme

            System.out.println(o.getName() + " went on the attack");
            while(true){

                long i = percentRandomNumber();
                boolean oRate = false;
                if(i<=o.getCriticalRate()){
                    oRate = true;
                    player.setHealth(player.getHealth() - o.getCriticalDamage());

                }else{
                damageToPlayer(o);
                }
                
                if(player.getHealth()<=0){
                    System.out.println("\n" + o.getName() + " hit " + o.getDamage());
                    System.out.println("\n" + player.getName() + " has 0 health left");
                    System.out.println("\nYou have lost");
                    offLocation();
                    o.fullObstacleHealth();
                    break;
                }else{
                    if(oRate == true){
                        System.out.println("\nCritical! " + o.getName() + " hit " + o.getCriticalDamage());
                    }else{
                System.out.println("\n" + o.getName() + " hit " + o.getDamage());
                    }
                System.out.println("\n" + player.getName() + " has " + player.getHealth() + " health left");
                }

                long u = percentRandomNumber2();
                boolean pRate = false;
                if(u<=player.getCriticalRate()){
                    pRate = true;
                    o.setHealth(o.getHealth() - player.getCriticalDamage());
                }else{
                damageToObstacle(o);
                }

                if(o.getHealth()<=0){ // Vurmak için sıra playerda
                    System.out.println("\n" + player.getName() + " hit " + player.getDamage());
                    System.out.println("\n" + o.getName() + " has 0 health left");
                    System.out.println("\nYou have won");
                    player.setMoney(player.getMoney() + o.getReward());
                    System.out.println("\nYou found " + o.getReward());
                    offLocation();
                    o.fullObstacleHealth();
                    break;
                }else{
                    if(pRate == true){
                        System.out.println("\nCritical! " + player.getName() + " hit " + player.getCriticalDamage());
                    }else{
                System.out.println("\n" + player.getName() + " hit " + player.getDamage());
                    }
                System.out.println("\n" + o.getName() + " has " + o.getHealth() + " health left");
                }

            }

        }else{

            System.out.println("You went on the attack");
            while(true){

                long u = percentRandomNumber3();
                boolean pRate = false;
                if(u<=player.getCriticalRate()){
                    pRate = true;
                    o.setHealth(o.getHealth() - player.getCriticalDamage());
                }else{
                damageToObstacle(o);
                }

                if(o.getHealth()<=0){ // Vurmak için sıra playerda
                    System.out.println("\n" + player.getName() + " hit " + player.getDamage());
                    System.out.println("\n" + o.getName() + " has 0 health left");
                    System.out.println("\nYou have won");
                    player.setMoney(player.getMoney() + o.getReward());
                    System.out.println("\nYou found " + o.getReward());
                    offLocation();
                    o.fullObstacleHealth();
                    break;
                }else{
                    if(pRate == true){
                        System.out.println("\nCritical! " + player.getName() + " hit " + player.getCriticalDamage());
                    }else{
                System.out.println("\n" + player.getName() + " hit " + player.getDamage());
                    }
                System.out.println("\n" + o.getName() + " has " + o.getHealth() + " health left");
                }

                long i = percentRandomNumber4();
                boolean oRate = false;
                if(i<=o.getCriticalRate()){
                    oRate = true;
                    player.setHealth(player.getHealth() - o.getCriticalDamage());

                }else{
                damageToPlayer(o);
                }
                
                if(player.getHealth()<=0){
                    System.out.println("\n" + o.getName() + " hit " + o.getDamage());
                    System.out.println("\n" + player.getName() + " has 0 health left");
                    System.out.println("\nYou have lost");
                    offLocation();
                    o.fullObstacleHealth();
                    break;
                }else{
                    if(oRate == true){
                        System.out.println("\nCritical! " + o.getName() + " hit " + o.getCriticalDamage());
                    }else{
                System.out.println("\n" + o.getName() + " hit " + o.getDamage());
                    }
                System.out.println("\n" + player.getName() + " has " + player.getHealth() + " health left");
                }
                
            }

        }

    }

    @Override
    public void onLocation(){

        if(this.locationState == false){
            System.out.println("You have arrived the " + this.name);
            this.locationState = true;
            }else{System.out.println("You are already at the " + this.name);}

        this.random = randomNumber();

        System.out.println("\nForest seems like silent");

        if(this.random<5){
    
            System.out.println("\nThere is a " + obstacle.getName());

        }else{

            System.out.println("\nThere is a " + obstacle2.getName());

        }

        System.out.print("\nWhat will you do:\n1-Fight\n2-Run away\nYour choice : ");
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        switch(c){

            case 1 :

            if(this.random<5){
    
                combat(obstacle);
    
            }else{
    
                combat(obstacle2);
    
            };
            break;
            case 2 : offLocation(); 
            break;

        }

    }

    @Override
    public void offLocation(){
        
        if(this.locationState == true){
        System.out.println("\nYou have leaved the " + this.name);
        this.locationState = false;
        }

    }
}
