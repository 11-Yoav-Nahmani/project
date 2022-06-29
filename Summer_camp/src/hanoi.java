

public class hanoi {

    static void towerOfHanoi(int n, char a, char c, char b)
    {
        if (n == 1)
        {
            printMove(a, c);
            return;
        }
        towerOfHanoi(n-1, a, b, c);
        printMove(a, c);
        towerOfHanoi(n-1, b, c, a);
    }

    public static void printMove(char start, char end) {
        System.out.println("move disk from " + start + " to disk " + end);
    }
public static void main(String[]args){
    towerOfHanoi(5, 'a', 'c', 'b');
}
}
