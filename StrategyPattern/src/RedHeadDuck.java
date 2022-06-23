public class RedHeadDuck  extends Duck {

    public RedHeadDuck(){
        super(new FlyWithWings(),new Quack());
    }
    @Override
    public void display() {
        System.out.println("i am a red head duck");
    }


}

