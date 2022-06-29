import java.util.ArrayList;

public class SafariMain {
    public static void main(String[]args){

        ArrayList<Animal>animals = new ArrayList<>();

        animals.add(new Dog("shoko"));
        animals.add(new Cat("luna",6));
        animals.add(new Tiger("chitos",12));
        animals.add(new Sheep("bruhhhhhhhhhh"));
        animals.add(new rottweiler("pichi",1));


        System.out.println("time to sleep everyone");
for(Animal a: animals){
    a.sleeping();
}
        for(Animal a: animals){
            a.wakeup();
        }

        for(Animal a: animals){
            if(a instanceof Tiger){
                a.haveABirthday();
            }
        }
        for(Animal a: animals){
            a.speak();
        }

        for(Animal a: animals){
            if(a instanceof Sheep){
            }else{
                a.sleeping();
            }
        }


    }
}
