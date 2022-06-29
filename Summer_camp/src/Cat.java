
public class Cat extends Animal{

    private int moustache;

    public Cat(String animalName, int moustache){
        super(animalName);
        this.moustache = moustache;
    }

    public int getMoustache() {
        return moustache;
    }

    public String hungerToString(int hunger){
        hunger =hunger();

        return "the hunger level is " + hunger;
    }


    public void changeMoustache(int moustache) {
        this.moustache = moustache;
    }

public void eatMouse(){
        eat();
        System.out.println("I ate a mouse. my hunger level now is " + hunger());
}

public void speak(){
        System.out.println("the cat " +  this.name() + ": meow,meow,meow" );
}
}
