import java.util.*;


public class exrc01 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);

        int[]upside = new int[10];

        for(int i = 0; i < upside.length; i++){
            upside[i] = n.nextInt();
        }
        for(int i = upside.length-1; i >= 0; i--){
            System.out.println(upside[i]);
        }


    }
}
