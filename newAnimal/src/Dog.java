public class Dog extends Mammal{

    private float boneWeight;


    public Dog(){
        super();
this.boneWeight = 0;
    }

    public Dog(String dogName, float weight, AnimalGender gender, float boneWeight){
        super(dogName,weight,gender);
        this.boneWeight = boneWeight;
    }
    public float boneWeight(){
        return this.boneWeight;
    }
    public void changeBoneWeight(float boneWeight){
        this.boneWeight = boneWeight;
    }
    @Override
    public void eat(){
this.eat();
this.changeWeight(this.getWeight()+this.boneWeight());
    }
    @Override
    public void sound(){
System.out.println("bark bark");
    }
}
