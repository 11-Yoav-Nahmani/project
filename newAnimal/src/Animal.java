public abstract class Animal {

    private String name;
    private float weight;

    public Animal(){
        this.name = "";
        this.weight = 0;
    }
    public Animal(String animal, float weight){
        this.name = animal;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    public float getWeight(){
        return this.weight;
    }
    public void changeName(String name){
        this.name = name;
    }
    public void changeWeight(float weight){
        this.weight = weight;
    }

    public void eat(){
this.weight = this.weight*2;
    }
    public abstract void sound();
}
