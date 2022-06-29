import java.util.*;
public class mixing {
    public static boolean isHere(int num,int[]array){

        for(int i = 0; i< array.length;i++){
            if(num == array[i]){
                return true;
            }
        }


        return false;
    }


    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int[]array1 = new int[10];
        int[]array2 = new int[10];
        int[]array3 = new int[10];
        int reverse = 0;

        System.out.println("enter data for the first array");
        for(int i = 0; i<array1.length;i++){
            array1[i] = n.nextInt();
        }

        System.out.println("enter data for the second array");
        for(int i = 0; i<array2.length;i++){
            array2[i] = n.nextInt();
        }

        System.out.println("enter data for the three array");
        for(int i = 0; i<array3.length;i++){
            array3[i] = n.nextInt();
        }

        for(int i = array3.length-1; i>=0;i--){
            if(isHere(array3[i],array1)){
                System.out.println(array2[i]);
            }
        }

    }
}
