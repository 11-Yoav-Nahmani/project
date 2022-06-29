public class recursive {

  static  int n = 4;

    public static int calculate(int n){

        if(n <= 2){
            return 1;
        }
else{

            return calculate(n-2)+calculate(n-1);
        }
    }


    public static int pow(int first,int second){

        if(first == 1){
            return second;
        }else{
            return pow(first - 1,second)*second;
        }
    }

    public static void main(String[]a){
        System.out.println(calculate(n));
        System.out.println(pow(8,10));
    }
}
