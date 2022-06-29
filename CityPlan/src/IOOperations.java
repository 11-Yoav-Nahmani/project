import java.util.Scanner;
public class IOOperations {



        final static Scanner userIO = new Scanner(System.in);

        public void print(String output) {
            System.out.println(output);
        }

        public String getString() {
            return userIO.next();
        }

        public int getNumber() {
            return userIO.nextInt();
        }
    }


