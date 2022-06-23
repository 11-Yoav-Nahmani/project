public class ModelDuck extends Duck {

    public ModelDuck(){
        super(new FlyNoWay(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("i am a model duck");
    }


}
