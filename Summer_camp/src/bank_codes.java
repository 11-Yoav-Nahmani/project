import java.util.*;



public class bank_codes {


    public static int length(int num) {
        int counter = 0;
        while (num != 0) {
            counter++;
            num = num / 10;
        }

        return counter;
    }


    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num, target_sum, testNum = 0;
        boolean first_trigger = false;


        num = n.nextInt();
        int loop = length(num);
        for (int i = 0; i < loop / 2; i++) {

            if (num >= 1000) {
                target_sum = num % 100;
            } else {
                target_sum = num;
            }
            for (int j = 2; j < 10; j++) {
                if (target_sum % j == 0) {
                    System.out.print(j + "");
                    testNum = target_sum / j;
                    break;
                }
            }
            if (testNum > 10 ) {
                for (int m = 2; m < 10; m++) {
                    if (testNum % m == 0) {
                        System.out.print(m + "" + testNum / m);
                        first_trigger = true;
                        break;
                    }
                }
            }
            if(!first_trigger){
                System.out.print(testNum);
            }

            num = num / 100;
        }
    }
}
