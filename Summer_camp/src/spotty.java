public class spotty extends Dog {

    private int points;

    public spotty(String name, int points){
        super(name);
        this.points = points;
    }
    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
