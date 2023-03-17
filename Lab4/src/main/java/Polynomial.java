import java.util.Objects;

public class Polynomial {
    private double a, b, c;
    Polynomial(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] decision(){
        if(b*b - 4 * a * c < 0){
            throw new IllegalArgumentException("Дискриминант меньше нуля");
        }

        if(a == 0){
            throw new IllegalArgumentException("Трехчлен не квадратный");
        }

            double[] arr = new double[2];
            arr[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            arr[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            return arr;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0 &&
                Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}