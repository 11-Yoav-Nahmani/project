import java.util.*;

public class binaryArray {
  public static int numInArray(int[] array, int n) {
    int minIndex = 0, maxIndex = array.length - 1, middleIndex = (array.length - 1) / 2;

    while (maxIndex > minIndex) {
      if (array[middleIndex] < n) {
        minIndex = middleIndex;
        middleIndex = (minIndex + maxIndex) / 2;
      } else {
        maxIndex = middleIndex;
        middleIndex = (minIndex + maxIndex) / 2;
      }
      if (array[middleIndex] == n) {
        return middleIndex;
      }
    }
    return -999;
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    int num;

    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    System.out.println("type the number you are trying to find: ");
    num = n.nextInt();
    if (numInArray(array, num)!=-999) {
      for (int i = 0; i < array.length; i++) {
        if (num == array[i]) {
          System.out.println("the number is in the array at block: " + i);
        }
      }
    } else {
      System.out.println("the number is not in the array");
    }
  }
}
