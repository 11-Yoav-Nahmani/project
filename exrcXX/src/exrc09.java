import java.util.*;

public class exrc09 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int reset;
                int[]upside = new int[100];

        for(int i = 1; i <= 100;i++){
            upside[i-1] = i;
        }

    System.out.println("הקלד את מספר הפעמים שהספרות יזוזו ימינה בוקטור");
        int num_destroyer = n.nextInt();
        int[]chunk = new int[num_destroyer];

        for(int i = 1; i <= num_destroyer;i++){
            chunk[i-1] = upside[i-1];
        }

        for(int j = 0; j < 100;j++){
 if(j+num_destroyer >= upside.length){
     reset = (j+num_destroyer)-upside.length;
     upside[j]  = chunk[reset];
 }else{
     upside[j] = upside[j+num_destroyer];
 }
        }

        for (int j : upside) {
            System.out.println(j);
        }

    }
}
