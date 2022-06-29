// Animal.java


public class Animal {

    private String name;
    private int    age;
    private int    hunger;

    public Animal(String animalName) {
        this.changeName(animalName);
        this.changeAge(0);
        this.changeHunger(0);
    }

    public String name() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    private void changeAge(int age){
        this.age = age;
    }

    private void changeHunger(int hungerLevel){
        this.hunger = hungerLevel;
    }

    public int age() {
        return this.age;
    }

    public int hunger() {
        return this.hunger;
    }

    public void haveABirthday() {

        // Add 1 to the age level
        this.changeAge(this.age() + 1);

        // Print the new age
        System.out.println("I had a birthday! i am " + this.age() + " years old");
    }

    protected void eat() {
        // Add 1 to the hunger level
        this.changeHunger(this.hunger() + 1);
    }

    public void speak(){
        System.out.println("animal is speaking");
    }
    public void sleeping(){
        System.out.println(this.name + " is sleeping");
    }
    public void wakeup(){
        System.out.println(this.name + " is awake");
    }
}