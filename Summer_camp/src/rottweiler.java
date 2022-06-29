public class rottweiler extends Dog{

    private int height;

    public rottweiler(String name, int height){
        super(name);
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
