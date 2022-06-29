import java.util.*;


public class exrc04 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        boolean confirm = true;
        int point = 0;

        int[]one = new int[3];
        int[]two = new int[7];


        for(int i = 0; i < one.length; i++){
         one[i] = n.nextInt();
        }

        for(int j = 0; j < two.length; j++){
            two[j] = n.nextInt();
        }

        for(int j = 0; j < two.length; j++){
            for(int i = 0; i < one.length; i++){
                if((one[i] == two[j])){
                    point++;
                }
            }

        }


        if(point == one.length){
            System.out.print("הקטן נמצא בגדול");
        }else {
            System.out.print("הקטן לא נמצא בגדול");
        }



    }
}