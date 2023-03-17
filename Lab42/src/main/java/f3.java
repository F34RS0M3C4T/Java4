public class f3 implements ArgumentFunction{
    private double a, b, c, d, sup, inf;
    f3 (double a, double b, double c, double d, double sup, double inf){
        if (sup < inf){
            throw new IllegalArgumentException("Верхняя граница меньше нижней");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.sup = sup;
        this.inf = inf;
    }

    public double getSup() {
        return sup;
    }

    public double getInf() {
        return inf;
    }

    public double Calculation(double x){
        if (x > sup || x < inf){
            throw new IllegalArgumentException("Аргумент выходит за границы заданного отрезка");
        }
        if (c*x+d == 0){
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        return (a*x+b)/(c*x+d);
    }
}