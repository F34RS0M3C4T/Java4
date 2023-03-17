public class Sum implements Functional{
    private double a, b;

    public Sum(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double decision(ArgumentFunction f){
        if (f.getInf() > a || f.getSup() < b){
            throw new IllegalArgumentException("Границы отрезка функции не входят в область функционала");
        }
        return f.Calculation(f.getInf()) +
                f.Calculation(f.getSup()) +
                f.Calculation((f.getSup()+f.getInf())/2);
    }
}
