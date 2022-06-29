import java.util.*;

public class mushrooms {

    static int[]towns = new int[100];
    static int[]mushroomSum = new int[20];

    static int[]maxGrows = new int[6];

    public static boolean numSearch(int[] array, int n) {
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
                minIndex = middleIndex;
            } else {
                maxIndex = middleIndex;
            }
            middleIndex = (minIndex + maxIndex) / 2;
        }
        return false;
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
    public  static void main(String[]args) {
        Scanner n = new Scanner(System.in);
        boolean full = true;
   int townName,townCounter = 0,planted = 0,num,indexLocated;

   for(int i=0; i<towns.length;i++){
       towns[i] = i+1;
   }


   townName = n.nextInt();
   while((townName != -1) && (townCounter < 20)){
if(numSearch(towns,townName)){
    mushroomSum[townCounter] = townName;
    townCounter++;
}else{
    System.out.println("error. number is not within the 100 towns range. type again");
}

if(townCounter < 20)
       townName = n.nextInt();
   }

        for(int i=0; i<mushroomSum.length;i++){
            if(mushroomSum[i] == 0){
                mushroomSum[i] = (mushroomSum[i-1]+mushroomSum[i-2])/2;
            }
        }

        System.out.println("mushrooms array: ");
        for(int i=0; i<mushroomSum.length;i++){
            System.out.print(mushroomSum[i] + " ");
        }

        mushroomSum = sort(mushroomSum);

        System.out.println();
        System.out.println("sorted mushrooms array: ");



        for(int i=0; i<mushroomSum.length;i++){
            System.out.print(mushroomSum[i] + " ");
        }

        for(int i=0; i<mushroomSum.length;i++){
            if(i+2 < mushroomSum.length)
            if(mushroomSum[i] + 1 == mushroomSum[i+1]){
                maxGrows[planted] = mushroomSum[i+2];
                mushroomSum[i+2] = 0;
                planted++;
            }
        }



        System.out.println();
    if (planted > 0) {
      System.out.println("the mushrooms that mario plants were: ");
      for (int i = 0; i < maxGrows.length; i++) {
        if (maxGrows[i] != 0)
            System.out.print(maxGrows[i] + " ");
      }
        System.out.println("those are " + planted + " mushrooms that represent " + (double)planted/mushroomSum.length + " from all the mushrooms collected");
        }

        System.out.println("mario wants to eat mushrooms. please type the number of mushroom for him to eat: ");



        for (int i = 0; i < mushroomSum.length; i++) {
           System.out.print(mushroomSum[i] + " ");
        }

        System.out.println();
        System.out.println("mario wants to eat mushrooms. please type the number of mushroom for him to eat: ");
        num = n.nextInt();


        mushroomSum = sort(mushroomSum);

        if(numSearch(mushroomSum, num)){
            indexLocated = numInArray(mushroomSum, num);
            mushroomSum[indexLocated] = -999;
            System.out.println("the mushroom from town number " + num + "has got eaten");
        }else{
            System.out.println("mushroom has not been found");
        }



        for (int i = 0; i < mushroomSum.length; i++) {
            System.out.print(mushroomSum[i] + " ");
        }
    }



}

