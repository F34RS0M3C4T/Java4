public class f4 implements ArgumentFunction{
    private double a, b, sup, inf;

    f4 (double a, double b, double sup, double inf){
        if (sup < inf){
            throw new IllegalArgumentException("Верхняя граница меньше нижней");
        }
        this.a = a;
        this.b = b;
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
        }return a*Math.exp(x)+b;
    }
}
