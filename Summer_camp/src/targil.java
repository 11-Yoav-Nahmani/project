import java.util.*;


public class targil {
    public static void main(String[]args){
Scanner n = new Scanner(System.in);
        int first_group_headCount = 0,second_group_headCount = 0;

        System.out.println("ברוך הבא לתוכנת חישוב כמות המדריכים. אנא הקלד את את גילי הילדים כדי לקבוע כמה מדריכים צריך ולאיזה קבוצה צריך אותם");
        for(int i = 1; i <= 15; i++){
            int m = n.nextInt();

            if(m > 15 || m < 8){
                while(m > 15 || m < 8){
                    System.out.println("מה שהקלדת היה שגוי. טווח הגילאים עשוי להיות גבוה או נמוך מדי. הקלד שנית.");
                    m = n.nextInt();
                }
            }
           if(m <= 11){
               first_group_headCount++;
           } else{
               second_group_headCount++;
           }
        }
        System.out.println("בקבוצת הצעירים (8-11) יש "+ first_group_headCount + " חניכים שאליהם צריכים להצטרף " + first_group_headCount/4 + " מדריכים");
        System.out.println("בקבוצת הצעירים (8-11) יש "+ second_group_headCount+ " חניכים שאליהם צריכים להצטרף " + second_group_headCount/7 + " מדריכים");

    }
}
