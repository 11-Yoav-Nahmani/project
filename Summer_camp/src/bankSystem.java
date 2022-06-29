import java.util.*;

public class bankSystem {
  static final int MAX_ARRAY_SIZE = 100;
  static final int USER_NOT_FOUND = -1;

  static int bankUsers[] = new int[MAX_ARRAY_SIZE];
  static int bankCodes[] = new int[MAX_ARRAY_SIZE];
  static double bankMoney[] = new double[MAX_ARRAY_SIZE];
  static int g_nNumOfAccounts = 0;

  public static boolean thisUserExist(int[] array, int n) {
    int minIndex = 0, maxIndex = array.length - 1, middleIndex = (array.length - 1) / 2;

    if ((array[minIndex] == array[maxIndex]) && (n < array[minIndex])
        || (array[minIndex] == array[maxIndex]) && (n > array[maxIndex])) {
      return false;
    }

    if ((n>array[maxIndex])||(n<array[minIndex])){
      return false;
    }

    if (array[maxIndex] == n) {
      return true;
    }

    if (array[minIndex] == n) {
      return true;
    }

    while ((maxIndex > minIndex)) {
      if (array[middleIndex] == n) {
        return true;
      } else if (array[middleIndex] < n) {
        minIndex = middleIndex+1;
      } else {
        maxIndex = middleIndex-1;
      }
      middleIndex = (minIndex + maxIndex) / 2;
    }
    return false;
  }

  public static int numInArray(int[] array, int n) {
    int minIndex = 0, maxIndex = array.length - 1, middleIndex = (array.length - 1) / 2;

    if (array[maxIndex] == n) {
      return maxIndex;
    } else if (array[minIndex] == n) {
      return minIndex;
    }

    while ((maxIndex > minIndex)) {
      if (array[middleIndex] < n) {
        minIndex = middleIndex;
      } else {
        maxIndex = middleIndex;
      }
      middleIndex = (minIndex + maxIndex) / 2;
      if (array[middleIndex] == n) {
        return middleIndex;
      }
    }
    return -999;
  }

  public static int[] sort(int[] bankUsersForSort) {
    int min, num, move, min_pos, moveCode;
    double moveMoney;

    for (int j = 0; j < bankUsersForSort.length; j++) {
      min_pos = j;
      min = bankUsersForSort[j];
      for (int i = j; i < bankUsersForSort.length; i++) {
        num = bankUsersForSort[i];
        if (num < min) {
          min = num;
          min_pos = i;
        }
      }
      move = bankUsersForSort[min_pos];
      moveCode = bankCodes[min_pos];
      moveMoney = bankMoney[min_pos];

      bankCodes[min_pos] = bankCodes[j];
      bankUsersForSort[min_pos] = bankUsersForSort[j];
      bankMoney[min_pos] = bankMoney[j];

      bankUsersForSort[j] = move;
      bankCodes[j] = moveCode;
      bankMoney[j] = moveMoney;
    }

    return bankUsersForSort;
  }

  public static void main(String[] args) {



    Scanner n = new Scanner(System.in);
    int input, securityCode, user = 0, checkmark = -999, code;
    double cash;

    System.out.println("welcome to the bank system!");
    System.out.println("press 1 for viewing the bank account details");
    System.out.println("press 2 to withdraw money from the ATM");
    System.out.println("press 3 to deposit money to the bank");
    System.out.println("press 4 to move set amount of money to other account");
    System.out.println("press 5 to change the secret code for the account");
    System.out.println("press 6 to logout of the system and change user");
    System.out.println("press 999 to exit this system");
    input = n.nextInt();
    while (input != 999) {
      bankUsers = sort(bankUsers);
      checkmark = numInArray(bankUsers, user);
      switch (input) {
        case 1:
          System.out.println("please type in your account security code.");
          securityCode = n.nextInt();
          if ((thisUserExist(bankCodes, securityCode)) && (numInArray(bankCodes, securityCode) == checkmark)) {
            checkmark = numInArray(bankCodes, securityCode);
            System.out.println("user number: " + bankUsers[checkmark]);
            System.out.println("money in shekels: " + bankMoney[checkmark]);
            System.out.println("money in dollar: " + bankMoney[checkmark] / 4);
            System.out.println("money in euros: " + bankMoney[checkmark] / 5);
          } else {
            System.out.println("ERROR: this security code does not exist in the system.");
          }
          System.out.println();
          System.out.println();
          break;
        case 2:
          System.out.println("please type in your account security code.");
          securityCode = n.nextInt();
          if (thisUserExist(bankCodes, securityCode)) {
            checkmark = numInArray(bankCodes, securityCode);
            System.out.println(
                "please type in the amount of cash you want to withdraw (in shekels)");
            cash = n.nextInt();
            if (cash > bankMoney[checkmark]) {
              System.out.println(
                  "ERROR. you cant withdraw this amount of money because you do not have that amount in your account.");
              break;
            } else {
              bankMoney[checkmark] -= cash;
              System.out.println("money got withdrawn successfully");
              break;
            }
          } else {
            System.out.println("ERROR: this security code does not exist in the system.");
            System.out.println();
            System.out.println();
            break;
          }
        case 3:
          System.out.println("please type in your account security code.");
          securityCode = n.nextInt();
          if (thisUserExist(bankCodes, securityCode)) {
            checkmark = numInArray(bankCodes, securityCode);
            System.out.println("please type in the amount of cash you want to insert (in shekels)");
            cash = n.nextInt();
            if (cash < 0) {
              System.out.println(
                  "ERROR. you cant insert this amount of money because the value is negative.");
              break;
            } else {
              bankMoney[checkmark] += cash;
              System.out.println("money got inserted successfully");
              break;
            }
          } else {
            System.out.println("ERROR: this security code does not exist in the system.");
            System.out.println();
            System.out.println();
            break;
          }
        case 4:
          System.out.println("please type in your account security code.");
          securityCode = n.nextInt();
          if (thisUserExist(bankCodes, securityCode)) {
            checkmark = numInArray(bankCodes, securityCode);
            System.out.println("please type in the account name you are giving money to.");
            user = n.nextInt();
            if (thisUserExist(bankUsers, user)) {
              int friend = numInArray(bankUsers, user);
              System.out.println("please type in the amount of cash you want to give");
              cash = n.nextInt();
              if ((cash > bankMoney[checkmark]) || (cash <= 0)) {
                System.out.println(
                    "ERROR. you cant withdraw this amount of money because you do not have that amount in your account of have typed in a negative number.");
                break;
              } else {
                bankMoney[checkmark] -= cash;
                bankMoney[friend] += cash;
                System.out.println("money got send successfully");
              }
            } else {
              System.out.println("ERROR: this user does not exist in the system.");
              System.out.println();
              System.out.println();
            }
          } else {
            System.out.println("ERROR: this security code does not exist in the system.");
            System.out.println();
            System.out.println();
          }
          break;
        case 5:
          System.out.println("please type in your account security code.");
          securityCode = n.nextInt();
          if (thisUserExist(bankCodes, securityCode)) {
            checkmark = numInArray(bankCodes, securityCode);
            System.out.println("please type your new security code");
            code = n.nextInt();
            bankCodes[checkmark] = code;
            System.out.println("the secret code has been changed successfully");
          } else {
            System.out.println("ERROR: this security code does not exist in the system.");
            System.out.println();
            System.out.println();
          }
          break;
        case 6:
          System.out.println("please type in your username.");
          user = n.nextInt();
          if (thisUserExist(bankUsers, user)) {
            System.out.println("user " + user + " is now connected.");
            checkmark = numInArray(bankUsers, user);

          } else {
            System.out.println("welcome to the bank system program, new user.");
            System.out.println(
                "if you want to sign up to our bank right now, please type in your security code number.");
            code = n.nextInt();
            System.out.println(
                "please type in amount of money that you want to insert to the account (in shekels)");
            cash = n.nextDouble();
            for (int i = 0; i < bankUsers.length; i++) {
              if (bankUsers[i] == 0) {
                bankUsers[i] = user;
                bankCodes[i] = code;
                bankMoney[i] = cash;
                bankMoney[i] += 500;
                g_nNumOfAccounts++;
                i = bankUsers.length;
              }
            }


            System.out.println("user signed up successfully");
            checkmark = numInArray(bankUsers, user);
          }

          break;
        default:
          System.out.println("error. number is not functional");
          System.out.println();
          System.out.println();
          break;
      }
      System.out.println("press 1 for viewing the bank account details");
      System.out.println("press 2 to withdraw money from the ATM");
      System.out.println("press 3 to deposit money to the bank");
      System.out.println("press 4 to move set amount of money to other account");
      System.out.println("press 5 to change the secret code for the account");
      System.out.println("press 6 to logout of the system and change user");
      System.out.println("press 999 to exit this system");
      input = n.nextInt();
    }
    System.out.println("goodbye");
  }
}
