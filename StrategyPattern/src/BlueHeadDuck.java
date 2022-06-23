public class BlueHeadDuck  extends Duck {

    public BlueHeadDuck(){
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("i am a blue head duck");
    }


}
