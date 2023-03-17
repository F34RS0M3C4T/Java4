import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class fTest {

    private static final double delta = 1e-9;

    @Test
    public void f1test() {
        f1 f = new f1(1, 1, 5, -5);
        assertEquals(2, f.Calculation(1), delta);
    }

    @Test
    public void f2test() {
        f2 f = new f2(1, 1, 5, -5);
        assertEquals(1, f.Calculation(1.5708), delta);
    }

    @Test
    public void f3test() {
        f3 f = new f3(2, 3, 1, 5,5, -5);
        assertEquals(1, f.Calculation(2), delta);
    }

    @Test
    public void f4test() {
        f4 f = new f4(1, 2, 5, -5);
        assertEquals(4, f.Calculation(0.6931471805), delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void BorderFail() {
        f1 f = new f1(1, 1, -6, -5);
        f.Calculation(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void BorderFailArg() {
        f1 f = new f1(1, 1, 5, -5);
        f.Calculation(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivisionFail() {
        f3 f = new f3(1, 1, 0, 0, 5, -5);
        f.Calculation(1);
    }
}
