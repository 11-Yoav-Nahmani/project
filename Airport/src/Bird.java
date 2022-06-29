public class Bird implements Fly{



    public Bird(String name,int currHeight) {


    }

    public int currHeight() {
        return (this.currHeight);
    }

    public void changeCurrHeight(int currHeight) {
        this.currHeight = currHeight;
    }

    public String name() {
        return (this.name);
    }

    public void flyHigher(int meters) {

        if ((this.currHeight() + meters <= MAX_HEIGHT) &&
                (this.currHeight() + meters > 0)) {
        }
        else {
            System.out.println("Cant fly to this altitdue");
        }
    }

    public void flyLower(int meters) {
        this.flyHigher(-meters);
    }

    public boolean land() {
        boolean isLandValid = false;

        if (LANDING_HEIGHT < this.currHeight()) {
            this.changeCurrHeight(0);
            System.out.println("Tweet, landing");
            isLandValid = true;
        }

        return (isLandValid);
    }

    public void waitInAir()	{

        if (this.currHeight() > LANDING_HEIGHT) {
            System.out.println("Tweet, waiting ");
        }
    }

    public int compareTo(Fly iToCompare) {
        return (this.currHeight() - (iToCompare.currHeight()));
    }
}
