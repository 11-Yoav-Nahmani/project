public class Tiger extends Cat{


    public Tiger(String name,int moustache){
        super(name,moustache);
    }

    public void speak(){
        System.out.println("the tiger " +  this.name() + ": grrr,grrr,grrr" );
    }


}
