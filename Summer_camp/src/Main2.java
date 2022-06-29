
import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Const definition
        final int EXIT_NUM = 0;

        // Variable definition
        int  nNumOfDuplicate;
        int  nDivideNum;
        int  nCurrNumCheck;
        boolean bIsPrime;
        int  nSumPrimeNumbers = 0;
        int  resultSum = 1;



        System.out.println("Enter number of duplicate numbers (1-25), " + EXIT_NUM + " to exit:");
        nNumOfDuplicate = scanner.nextInt();

        while (nNumOfDuplicate != EXIT_NUM) {

            for (nCurrNumCheck = 2;nSumPrimeNumbers < nNumOfDuplicate; nCurrNumCheck++) {
                bIsPrime = true;

                for (nDivideNum = 2;  (nDivideNum < nCurrNumCheck) && (bIsPrime); ++nDivideNum)
                {
                    if (nCurrNumCheck % nDivideNum == 0)
                    {
                        bIsPrime = false;
                    }
                }

                if (bIsPrime){
                    nSumPrimeNumbers++;
                    resultSum *= nCurrNumCheck;
                }

            }

            System.out.println(resultSum);
            nNumOfDuplicate = scanner.nextInt();
        }
    }
}

