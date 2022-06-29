import java.util.*;


public class exrc02 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        boolean confirm = true;

        int[]one = new int[500];
        int[]two = new int[500];


        for(int i = 0; i < one.length; i++){
            if(one[i] != two[i]){
                confirm = false;
                System.out.print("הוקטורים אינם שווים");
            }
        }

        if(confirm){
            System.out.print("הוקטורים זהים לחלוטין");
        }



    }
}
