public class elephant extends Mammal {


        public elephant() {
            super();
        }

    @Override
    public void sound() {
        System.out.println("ELEPHANT SOUNDS");
    }

    public elephant(String dogName, float weight, AnimalGender gender){
            super(dogName,weight,gender);
        }



}
