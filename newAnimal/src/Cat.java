public class Cat extends Mammal{
    private float milkPercentage;


    public Cat(){
        super();
        this.milkPercentage = 0;
    }
    public Cat (String catName, float weight, AnimalGender gender, float milkPercentage){
        super(catName,weight,gender);
        this.milkPercentage = milkPercentage;
    }
    public float milkPercentage(){
        return  this.milkPercentage;
    }
    public void changeMilkPercentage(float milkPercentage){
        this.milkPercentage = milkPercentage;
    }
    @Override
    public void eat(){
        this.eat();
        this.changeWeight(this.getWeight()+this.getWeight()/this.milkPercentage);
    }
    @Override
    public void sound(){
        System.out.println("MIAU MIAU!!");
    }
}
