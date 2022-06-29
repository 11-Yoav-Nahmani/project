public class Plane extends GasVehicle implements Fly {

    private String name;
    private int currHeight;

    public Plane(){
        this.name="";
        this.currHeight= 10000;
    }

    public Plane(String name, int currHeight){
        this.name = name;
        this.currHeight = currHeight;
    }

    @Override
    public int compareTo(Fly o) {
        return 0;
    }

    public void lower(int height){
        if(this.currHeight > 0) {
            this.flyHigher(50);
            this.gasAmount -= 50;
        }
    }

    public void waitOnAir(){
        this.gasAmount -= 50;
    }

    public void higher(int height){
        if(this.currHeight > 0) {
            this.flyLower(50);
            this.gasAmount -= 50;
        }
    }

    public boolean land(){
        if (this.getGasAmount() > 1000 && this.currHeight > 1000){
            return land();
        }
        return false;
    }

}
