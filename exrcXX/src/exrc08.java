import java.util.*;

public class exrc08 {
        public static void main(String[]args){
            Scanner n = new Scanner(System.in);
            int[]upside = new int[51];

int num_destroyer = n.nextInt();

            for(int i = 1; i<upside.length;i++){
                    upside[i] = i;
            }

while(num_destroyer != -999){

for(int i = 1; i<upside.length;i++){
    if(i == num_destroyer){
        upside[i] = 0;
    }
}

    num_destroyer = n.nextInt();
        }
System.out.println("והמספרים שלא נכתבו הם: ");
            for(int j = 0; j<upside.length;j++){
                if(upside[j] != 0){
                    System.out.print(upside[j] + " ");
                }
            }

    }
}
