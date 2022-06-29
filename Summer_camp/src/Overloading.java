public class Overloading {
  /*
   * Overloading: giving several methods in the same
   * class the same name. They must differ in terms of
   * the type and/or number of arguments.
   *
   * The compiler decides which one to use based on the
   * type of arguments that we pass. In a sense, they compiler
   * gives each one a different name (something like
   * printWithType_int or printWithType_double or
   * printWithType_int_int, and translates each invocation of
   * the overloaded name to an invokacation with the unique (but
   * hidden) name.
   *
   * In general, overloading makes code look more elegant, but
   * the code becomes more confusing, because it's not always
   * easy to know which method is being called. It is usually
   * better to give each method a different name yourself, rather
   * than rely on the compiler to do it for you.
   */

  public static void printWithType(int i) {
    System.out.println("An int: " + i);
}

        public static void printWithType(double d) {
            System.out.println("A double: "+d);

        }

        public static void printWithType(String s) {
            System.out.println("A String: "+s);

        }

        public static void printWithType(int i, int j) {
            System.out.println("Two int's: "+i+", "+j);
        }

        /*
         * Java does not allow overloaded methods to differ
         * only by the return type.
         */

        public static int cannotOverloadReturnType() {
            return -1;
        }

        //public static double cannotOverloadReturnType() {
        //  return -1.0;
        //}

        /*
         * Figure this out.
         */

        public static void overTheTop(int i, double d) {
            System.out.println("int, double");
        }

        public static void overTheTop(double d, int i) {
            System.out.println("double, int");
        }

        public static void main(String[] arguments) {
            overTheTop(9.9,7);
            overTheTop(8,9.9);
            printWithType(17.0);
            printWithType("overloading!?!");
            printWithType(5,-7);
        }
    }
