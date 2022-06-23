public class RubberDuck extends Duck {

    public RubberDuck(){
        super(new FlyNoWay(),new Squeak());
    }

    @Override
    public void display() {
        System.out.println("i am a rubber duck");
    }



}
