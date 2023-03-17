import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test24 {

    @Test
    public void Integral1() {
        Integral i = new Integral(0, 1);
        assertEquals(1.7182818284, i.decision(new f4(1, 0, 1, 0)), 1E-5);
    }

    @Test
    public void Integral2() {
        Integral i = new Integral(-10, 10);
        assertEquals(0.0, i.decision(new f2(5, 3, 100, -100)), 1E-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IntegralFail() {
        Integral i = new Integral(-10, 10);
        i.decision(new f1(5, 3, 5, -5));
    }

    @Test
    public void Sum1() {
        Sum i = new Sum(-10, 10);
        assertEquals(6.0, i.decision(new f3(4, 10, 2, 5, 20, -20)), 1E-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SumStartEndMid_fail() {
        Sum i = new Sum(-10, 100);
        i.decision(new f3(4, 10, 2, 5, 20, -20));
    }
}
