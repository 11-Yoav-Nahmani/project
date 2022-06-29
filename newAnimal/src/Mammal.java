public abstract class Mammal extends Animal {

    private AnimalGender gender;

    public Mammal(){
        super();
this.gender = AnimalGender.MALE;
    }

    public Mammal(String mammalName, float weight, AnimalGender gender){
        super(mammalName,weight);
        this.gender = gender;
    }
    public AnimalGender gender(){
        return gender;
    }
    public void changeGender(AnimalGender g){
        this.gender = g;
    }


}
