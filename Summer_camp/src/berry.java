import java.util.*;

public class berry {
    public static int numInArray(int[] array, int n) {
        int minIndex = 0, maxIndex = array.length - 1, middleIndex = (array.length - 1) / 2;

    if ((n < array[maxIndex]) && (n > array[minIndex])) {
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
        }
        return -999;
    }
    public static int[]sort(int[]array_for_sort){
        int min = array_for_sort[0],num,move, min_pos = 0;

        for (int j = 0; j < array_for_sort.length; j++){
            min_pos=j;
            min = array_for_sort[j];
            for (int i = j; i < array_for_sort.length; i++) {
                num = array_for_sort[i];
                if (num < min) {
                    min = num;
                    min_pos = i;
                }
            }
            move = array_for_sort[min_pos];
            array_for_sort[min_pos] = array_for_sort[j];
            array_for_sort[j] = move;
        }

        return array_for_sort;
    }

    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
          int boughtGoods = 0,num;
        int[]packages = new int[10];

        System.out.println("type the number of berry's in each package");
        for(int i = 0;i<packages.length;i++){
            packages[i] = n.nextInt();
        }

        int[]sortedPackages = sort(packages);
        for(int i = 0;i<sortedPackages.length;i++){
            System.out.print(sortedPackages[i] + " ");
        }
        System.out.println();
        while(boughtGoods < 10){
            System.out.println("what set amount of package do you want");
            num = n.nextInt();
            if(numInArray(sortedPackages,num) != -999){
                System.out.println("you bought package number:" + numInArray(sortedPackages,num));
                boughtGoods++;
                sortedPackages[numInArray(sortedPackages,num)] = 0;
            }
            else{
                System.out.println("we dont have that amount be selling here! go away!!");
            }
            sortedPackages = sort(sortedPackages);
            for(int i = 0;i<sortedPackages.length;i++){
                System.out.print(sortedPackages[i] + " ");
            }
        }

    }

}
