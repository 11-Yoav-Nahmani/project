public class Fly implements Comparable<Fly> {

   private String name;
   private int currentHeight;

   public Fly(String name,int currentHeight){
       this.name = name;
       this.currentHeight = currentHeight;
   }

    public void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    public int currHeight() {
        return currentHeight;
    }

    public void flyHigher(int meters){
        this.currentHeight = currentHeight+meters;
    }
    public void flyLower(int meters){
        this.currentHeight = currentHeight-meters;
    }

    public boolean land(){
      return true;
    }

    @Override
    public int compareTo(Fly o) {
        return 0;
    }
}
