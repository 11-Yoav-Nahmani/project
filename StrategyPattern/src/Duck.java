public abstract class Duck {

    IFlyBehavior Fly;
    IQuackBehavior Quack;

    public Duck(IFlyBehavior fly, IQuackBehavior quack) {
        Fly = fly;
        Quack = quack;
    }

    public void PerfromFly() {
        Fly.Fly();
    }

    public void PerfromQuack() {
        Quack.quack();
    }

    public void Swim(){
        System.out.println("swim!");
    }



    public abstract void display();


}
