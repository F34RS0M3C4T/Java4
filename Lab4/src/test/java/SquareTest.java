import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SquareTest {

    private static final double delta = 1e-9;

    @Test
    public void decision1() {
        Polynomial squarePol = new Polynomial(1, 3, -4);
        double[] actual = squarePol.decision();
        double[] expected = {1, -4};
        assertArrayEquals(expected, actual, delta);
    }

    @Test
    public void decision2() {
        Polynomial squarePol = new Polynomial(1, 4, 4);
        double[] actual = squarePol.decision();
        double[] expected = {-2, -2};
        assertArrayEquals(expected, actual, delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void solveException() {
        Polynomial squarePol = new Polynomial(0, 3, -4);
        squarePol.decision();
    }

    @Test(expected = IllegalArgumentException.class)
    public void solveNull() {
        Polynomial squarePol = new Polynomial(1, 2, 3);
        squarePol.decision();
    }
}