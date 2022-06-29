public class Sheep extends Animal{


    public Sheep(String animalName){
        super(animalName);
    }

    public void speak(){
        System.out.println("the Sheep " +  this.name() + ": mheeee,mheeee,mheeee" );
    }


}
