import java.util.*;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int nInverted = 0;
    int nUserNum;
    int nHelpNum;
    int nCurrentDigit = 0;

    // Code section

    System.out.println("Please insert a number - ");
    nUserNum = scanner.nextInt();

    nHelpNum = nUserNum;

    // Printing the original number
    System.out.println("Your original number is  - " + nUserNum);

    // Inverting the number
    while (nHelpNum != 0) {
      // Getting the current digit
      nCurrentDigit = nHelpNum % 10;

      nInverted *= 10;
      nInverted += nCurrentDigit;

      nHelpNum /= 10;
    }

    // Printing the result
    System.out.println("The reversed number is - " + (nInverted));
  }
    }
