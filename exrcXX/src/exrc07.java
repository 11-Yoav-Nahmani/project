import java.util.*;


public class exrc07 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
int jump,counter=0,sum=0,remember = 0;


        int[]array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = n.nextInt();
        }

        for(int i = 1; i <= array.length; i++){
            if(i == array.length){
                jump = array[array.length-1]-array[i-2];
                if(jump > 0)
                    counter++;
            }else {
                jump = array[i] - array[i - 1];
                if(jump > 0){
                    counter++;

                }
            }
if (counter > sum){
                remember = array[i-counter];
                sum = counter;
            }
        }
System.out.println("הסדרה הארוכה ביותר התחילה ב" +
 remember +
        "והיו בה" +
        sum +
        "איברים");

    }
}