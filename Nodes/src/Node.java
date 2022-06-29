public class Node {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s", element);
            if(element != null){
            System.out.print("==>");
            }
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
        T min = x;   // assume x is initially the largest

        if(y.compareTo(min) < 0) {
            min = y;   // y is the largest so far
        }

        if(z.compareTo(min) < 0) {
            min = z;   // z is the largest now
        }
        return min;   // returns the largest object
    }
    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 13, 23 ,70 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array
        System.out.println("Array DoubleArray contains:");
        printArray(doubleArray);
        System.out.println("Array charArray contains:");
        printArray(charArray);
        System.out.println(minimum(5,6,2));

    }
}


