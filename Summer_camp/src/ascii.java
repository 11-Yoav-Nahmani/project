import java.util.*;

public class ascii {

  static int[] abc = new int[26];

  public static int locateNum(int[] array, int n) {
    int minIndex = 0, maxIndex = array.length - 1, middleIndex = (array.length - 1) / 2;



    if (array[maxIndex] == n) {
      return array[maxIndex];
    }

    if (array[minIndex] == n) {
      return array[minIndex];
    }

    while ((maxIndex > minIndex)) {
      if (array[middleIndex] == n) {
        return n;
      } else if (array[middleIndex] < n) {
        minIndex = middleIndex+1;
      } else {
        maxIndex = middleIndex-1;
      }
      middleIndex = (minIndex + maxIndex) / 2;
    }
    return -999;
  }

  public static int[] sort(int[] array) {
    int min, num, move, min_pos;

    for (int j = 0; j < array.length; j++) {
      min_pos = j;
      min = array[j];
      for (int i = j; i < array.length; i++) {
        num = array[i];
        if (num < min) {
          min = num;
          min_pos = i;
        }
      }
      move = array[min_pos];
      array[min_pos] = array[j];
      array[j] = move;
    }
    return array;
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    char latter;
    int counter = 0,num;

    latter = n.next().charAt(0);
    while (latter != '*') {

      char ascii = latter;
      abc[counter] = ascii;
      counter++;

      if (counter == 26) {
        System.out.println(
            "every ABC latter has been typed in. to stop press *, to continue press #");
      }
      latter = n.next().charAt(0);
      if (latter == '#') {
        counter = 0;
      }
    }
    for(int i = 0; i <abc.length;i++ ){
      if((abc[i] >= 65) && (abc[i] <= 90)){
        abc[i] += 22;
      }
    }
    System.out.println("new abc order");
    for(int i = 0; i <abc.length;i++ ){
System.out.print( (char)abc[i] + " ");
    }
    System.out.println();
    abc = sort(abc);
    System.out.println("old abc order");
    for(int i = 0; i <abc.length;i++ ){
      System.out.print( (char)abc[i] + " ");
    }
System.out.println("");
    System.out.println("try to locate a latter of the abc by typing his position");
    num = n.nextInt();

char located = (char)locateNum(abc,num);

System.out.println("the latter in position " + locateNum(abc,num) + " is the latter " + located);
  }
}
