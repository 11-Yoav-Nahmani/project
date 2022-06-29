public abstract class Vehicle  {

    private Gear gear;
    private int fuel;

    public Vehicle(Gear gear, int fuel){
        this.fuel=fuel;
        this.gear = gear;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public void Horn(){
        System.out.println("honk!!!!");
    }
}
