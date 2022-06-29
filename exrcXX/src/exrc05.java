import java.util.*;


public class exrc05 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);

        int[]one = new int[50];
        int[]two = new int[50];


        for(int i = 0; i < one.length; i++){
            one[i] = n.nextInt();
        }

        for(int j = 0; j < two.length; j++){
            two[j] = n.nextInt();
        }

        int[]combine = new int[50];

        for (int m = 0; m < combine.length; m++){
            combine[m] = 0;
            combine[m] = one[m] + two[m];
        }

        for (int m = 0; m < combine.length; m++){
               System.out.println(combine[m]);
        }

    }
}