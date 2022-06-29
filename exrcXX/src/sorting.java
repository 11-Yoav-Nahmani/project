import java.util.*;

public class sorting {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
    int[]array_for_sort = new int[20];
    int[] sorted_array_1;
    int num,min_pos,min,move;

    System.out.println("Index array:");
    for(int i = 0; i<array_for_sort.length;i++){
        System.out.print(i + " ");
    }

        System.out.println();
        System.out.println("enter numbers for the array:");
        for(int i = 0; i<array_for_sort.length;i++){
            array_for_sort[i] = n.nextInt();
        }

        System.out.println("random:");
        for(int i = 0; i<array_for_sort.length;i++){
            System.out.print(array_for_sort[i] + " ");;
        }


        sorted_array_1 = new int[array_for_sort.length];
        System.out.println();


min = array_for_sort[0];
        min_pos = 0;

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


        System.out.println("selection sorted:");
        for(int i = 0; i<array_for_sort.length;i++){
            System.out.print(array_for_sort[i] + " ");
        }


        System.out.println();
        System.out.println("enter numbers for the array:");
        for(int i = 0; i<array_for_sort.length;i++){
            array_for_sort[i] = n.nextInt();
        }


        for (int i = 0; i < array_for_sort.length; i++){
            for (int j = i; j < array_for_sort.length-1; j++) {
                    if (array_for_sort[j] > array_for_sort[j + 1]) {
                        move = array_for_sort[j + 1];
                        array_for_sort[j + 1] = array_for_sort[j];
                        array_for_sort[j] = move;
                    }
            }
        }

        System.out.println("bubble sorted:");
        for(int i = 0; i<array_for_sort.length;i++){
            System.out.print(array_for_sort[i] + " ");
        }

    }
}
