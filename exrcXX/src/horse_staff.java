import java.util.*;

public class horse_staff {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int reset=0,limit=0;
        boolean Trigger_A = false;

        int[]upside = new int[100];
        boolean nextOneDown = false;

        for(int i = 0; i < upside.length;i++){
            upside[i] = i+1;

        }




        for(int j = 0; j < upside.length;j++){
            if(upside[j] != 0){
                reset++;
            }
                if((reset%7==0) && upside[j] != 0){
                    upside[j]=0;
                    reset=0;
                    limit++;
                }


            System.out.println(upside[j] + " ");

            if((limit<99)&&(j+1 == upside.length)){
                j = -1;
            }

            }

        for(int i = 0; i < upside.length;i++){
            if(upside[i] != 0){
                System.out.println(upside[i] + "החבר הנבחר הוא חבר מספר");
            }

        }

    }
    }
