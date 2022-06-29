public abstract class GasVehicle {

    protected int gasAmount;


    public int getGasAmount(){
        return this.gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refuel(int tank){
        this.gasAmount+=tank;
    }
}
