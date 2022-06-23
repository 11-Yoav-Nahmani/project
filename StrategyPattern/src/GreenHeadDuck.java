public class GreenHeadDuck extends Duck {

    public GreenHeadDuck(){
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("i am a green head duck");
    }


}
