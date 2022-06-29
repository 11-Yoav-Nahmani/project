public class MainAnimal {

    public static void main(String[]args){


        Dog dude = new Dog("bathy",6,AnimalGender.MALE,17);
        Cat miouf = new Cat("stimpy",15,AnimalGender.MALE,60);
        Dog lassy = new Dog("LASSY",9,AnimalGender.FEMALE,2);

        System.out.println(dude.getName() + " weight: " + dude.getWeight());
        System.out.println(miouf.getName() + " weight: " + miouf.getWeight());
        System.out.println(lassy.getName() + " weight: " +  lassy.getWeight());

        dude.eat();
        miouf.eat();
        lassy.eat();

        System.out.println(dude.getName() + " weight: " + dude.getWeight());
        System.out.println(miouf.getName() + " weight: " + miouf.getWeight());
        System.out.println(lassy.getName() + " weight: " +  lassy.getWeight());

        dude.sound();
        miouf.sound();
        lassy.sound();
    }
}
