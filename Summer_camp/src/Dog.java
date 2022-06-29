
public class Dog extends Animal{


    public Dog(String animalName){
        super(animalName);
    }

    public void speak(){
        System.out.println("the dog " +  this.name() + ": huff, huff, huff" );
    }


}
