public class TimeChecker {

    /**
     * @param args
     */
    public static void main(String[] args) {

        timeNextGen timCheckSeconds = new timeNextGen("12:12:00");

        timCheckSeconds.setSeconds(100);


        System.out.println("Checking the seconds setter method");
        System.out.println("=============================");
        System.out.println("		Wanted result: 12:12:00");
        System.out.print  ("		Actual result: ");
        timCheckSeconds.print();
        System.out.println();

        // Testing the minutes setter method.
        timeNextGen timCheckMinutes = new timeNextGen("00:00:00");
        timCheckMinutes.setHours(12);
        timCheckMinutes.setMinutes(100);
        timCheckMinutes.setSeconds(12);

        System.out.println("Checking the minutes setter method");
        System.out.println("=============================");
        System.out.println("		Wanted result: 12:00:12");
        System.out.print  ("		Actual result: ");
        timCheckMinutes.print();
        System.out.println();

        // Testing the hours setter method.
        timeNextGen timCheckHours = new timeNextGen("00:00:00");
        timCheckHours.setHours(100);
        timCheckHours.setMinutes(12);
        timCheckHours.setSeconds(12);
        System.out.println("Checking the hours setter method");
        System.out.println("===========================");
        System.out.println("		Wanted result: 00:12:12");
        System.out.print  ("		Actual result: ");
        timCheckHours.print();
        System.out.println();

        // Testing isEqual
        timeNextGen timCheckIsEqual = new timeNextGen("00:00:00");
        timCheckIsEqual.setHours(1);
        timCheckIsEqual.setMinutes(17);
        timCheckIsEqual.setSeconds(20);

        timeNextGen timEqualTo = new timeNextGen("00:00:00");
        timEqualTo.setHours(1);
        timEqualTo.setMinutes(17);
        timEqualTo.setSeconds(20);

        System.out.println("Checking isEqual");
        System.out.println("================");
        System.out.println("		Wanted result: " + true);
        System.out.print  ("		Actual result: " +
                timCheckIsEqual.isEquals(timEqualTo));
        System.out.println();

        // Testing setTo
        timeNextGen timTimeToSet = new timeNextGen("00:00:00");
        timTimeToSet.setHours(0);
        timTimeToSet.setMinutes(0);
        timTimeToSet.setSeconds(0);

        System.out.println("Checking setTo");
        System.out.println("==============");
        System.out.println("		Wanted result: 00:00:00");
        System.out.print  ("		Actual result: ");
        timCheckIsEqual.setTo(timTimeToSet);
        timCheckIsEqual.print();
        System.out.println();

        // Testing isLater
        timeNextGen timLater = new timeNextGen("00:00:00");
        timLater.setHours(7);
        timLater.setMinutes(14);
        timLater.setSeconds(0);

        System.out.println("Checking isLater");
        System.out.println("================");
        System.out.println("		Wanted result: " + true);
        System.out.println("		Actual result: " +
                timLater.isLater(timCheckIsEqual));
    }
}