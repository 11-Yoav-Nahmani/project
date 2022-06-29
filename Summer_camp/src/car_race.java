import java.util.*;


public class car_race {
    static int obi, protections,final_speed = 0,Max_speed;

    public static void event(int num){
        switch (num){
            case 1:
                protections = protections - 1;
                final_speed = Max_speed/2;
                break;
            case 2:
                protections = protections - 3;
                final_speed = Max_speed/3;
                break;
            case 3:
                final_speed = Max_speed*Max_speed;
                break;
            case 4:
                protections = 0;
                break;
        }
    }


    public static void text_blob(){
        System.out.println("כדי להתחיל, אנא תבחר את המכשול איתו אתה רוצה שהרכב יתמודד");
        System.out.println("1 - שלולית נפט");
        System.out.println("2 - כדור ברזל ענקי");
        System.out.println("3 - מהירות טורבו");
        System.out.println("4 - טיל קרקע קרקע");
    }
    public static void main(String[]args){
Scanner n = new Scanner(System.in);

System.out.println("ברוכים הבאים ליום המירוץ! אנא הקלד את המהירות המקסימלית של הרכב כדי להתחיל (מטר לדקה)");
        Max_speed = n.nextInt();
        System.out.println("אנא הקלד את מספר ההגנות המקסימליות של הרכב (אסור לך יותר מ5 כאלה)");
         protections = n.nextInt();
            while(protections > 5 || protections < 1){
                System.out.println("חשבתי שהייתי ברור.. אסור לך יותר מ5 הגנות לרכב! הקלד שנית");
                protections = n.nextInt();
            }
        text_blob();
        obi = n.nextInt();
            while(obi > 4 || obi < 1){
                System.out.println("מה שהקלדת שגוי, הקלד שנית");
                obi = n.nextInt();
            }
          event(obi);

if(25000/Max_speed + 25000/final_speed < 20 && protections > 0){
    System.out.println("המכונית ניצחה! כל הכבוד");
}else{
    System.out.println("המכונית נכשלה!");
}
    }
}
