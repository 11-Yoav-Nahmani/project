import java.util.*;


public class exrc06 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
          int counter = 0,sum, limit = 0;
        int[]upside = new int[100];

        for(int i = 0; i < upside.length; i++){
            upside[i] = n.nextInt();
            counter += upside[i];
        }
        sum = counter/upside.length;

for(int i = 0; i < upside.length; i++){
    if(upside[i] == sum){
        System.out.println("הממוצא של המערך נמצא באיבר מספר: " +
                i +
                " והוא: " +
                upside[i]);
    }
}

    }
}