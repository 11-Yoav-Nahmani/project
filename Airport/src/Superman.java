public class Superman {
    private int currHeight;

    public int currHeight() {
        return (this.currHeight);
    }

    public void changeCurrHeight(int currHeight) {
        this.currHeight = currHeight;
    }

    public String name() {
        return ("Superman");
    }

    public void flyHigher(int meters) {
        this.changeCurrHeight(this.currHeight() + meters);
    }

    public void flyLower(int meters){
        this.changeCurrHeight(this.currHeight() - meters);
    }

    public boolean land() {
        this.changeCurrHeight(0);

        return (true);
    }

    public void waitInAir()	{
        System.out.println("Superman waiting");
    }

    public void helpLand(Fly flyHelpy) throws Exception {
        throw new Exception("Help land is not implemented!, implement it!!!");
    }

    public int compareTo(Fly iToCompare) {
        return (this.currHeight() - (iToCompare.currHeight()));
    }
}