import java.util.*;

public class BaseCalculator {
    public static int convertToBaseTen(int num,int oldBase){
        int sum = 0,count =0;

        while (num != 0) {
            sum = sum + (int) Math.pow(oldBase, count) * num % 10;
            num = num / 10;
            count++;
        }

        return sum;
    }

    public static int convertToNewBase(int numInBaseTen,int newBase){
        int count = 1,endPoint = 0;

        while (numInBaseTen != 0) {
            if (numInBaseTen % newBase != 0) {
                endPoint = endPoint + count*(numInBaseTen%newBase);
                count *= 10;
            } else {
                count *= 10;
            }

            System.out.println("sum%newBase " + numInBaseTen%newBase);
            System.out.println("sum " + numInBaseTen);
            System.out.println();

            if ((numInBaseTen / newBase == 1) && (numInBaseTen % newBase != 0)) {
                count *= 10;
                endPoint += count * (numInBaseTen % newBase);
            }
            numInBaseTen /= newBase;
        }
        return endPoint;
    }


  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int num, starting = 0;
    int oldBase, newBase;

    System.out.println("welcome to base converter. press 0 to start");
    starting = n.nextInt();
    while ((starting == 0)) {
      System.out.println("please insert a digit");
      num = n.nextInt();
      while (num < 0) {
        System.out.println("found error, please insert positive digit");
        num = n.nextInt();
      }
        System.out.println("please insert a digit for oldBase");
      oldBase = n.nextInt();
      while (oldBase > 10 || oldBase < 2) {
        System.out.println("found error, please select bases between 2 and 10");
        oldBase = n.nextInt();
      }
        System.out.println("please insert a digit for newBase");
      newBase = n.nextInt();
      while (newBase > 10 || newBase < 2) {
        System.out.println("found error, please select bases between 2 and 10");
        newBase = n.nextInt();
      }

      int numberInBaseTen  = convertToBaseTen(num,oldBase);

      System.out.println(numberInBaseTen);


        System.out.println("the new number is: ");
      System.out.print(convertToNewBase(numberInBaseTen,newBase));
        System.out.println("and the new base is: ");
      System.out.print(newBase);
        System.out.println("(old base: ");
      System.out.println(oldBase + ")");
      System.out.println("task completed, type 0 again to convert again and type 1 to exit");
      while((starting == 0)||(starting == 1)){
          System.out.println("error, please type again");
          starting = n.nextInt();
      }
      starting = n.nextInt();
    }
  }
}
