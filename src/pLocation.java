public abstract class pLocation {

    String name;
    cPlayer player;
    boolean locationState = false;

    public pLocation(cPlayer player){
        
        this.player = player;

    }
    
    public abstract void onLocation();

    public abstract void offLocation();

}
