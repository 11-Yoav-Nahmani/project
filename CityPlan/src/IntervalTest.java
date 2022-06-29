import static org.junit.Assert.*;

public class IntervalTest {

    public Interval test;

    @org.junit.Before
    public void setUp() throws Exception {
        this.test = new Interval(1,4);
    }

    @org.junit.Test
    public void intervalArea_false() {
        Interval test2 = new Interval(5,9);
        Interval test4 = test.intervalArea(test2);
        boolean not = false;
        assertEquals(not,test.equals(test4));
    }


    @org.junit.Test
    public void test_NotEquals() {
        boolean helpMe = false;
      Boolean tired = test.equals(new Interval(5,8));
        assertEquals(helpMe,tired);
    }

    @org.junit.Test
    public void test_Equals() {
        boolean helpMe = true;
        Boolean tired = test.equals(new Interval(1,4));
        assertEquals(helpMe,tired);
    }

    @org.junit.Test
    public void testToString() {
            String check = "1 - 4";
            String interval = test.toString();
            assertEquals(check,interval);
    }

    @org.junit.Test
    public void getDistance() {
        final int check = 3, intervalInfo = this.test.getDistance();
        assertEquals(check,intervalInfo);
    }

    @org.junit.Test
    public void intervalArea() {
        Interval test2 = new Interval(5,9);
        Interval test3 = new Interval(1,9);
        Interval test4 = test.intervalArea(test2);
        assertEquals(test3,test4);
    }
}