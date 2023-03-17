public class MaxRoot {
    private Polynomial squareTr;

    MaxRoot(double a, double b, double c){
        squareTr = new Polynomial(a, b, c);
    }

    public double Root(){
        if (squareTr.decision() == null){
            throw new NullPointerException("Нет корней");
        }
        if (squareTr.decision()[0] > squareTr.decision()[1]){
            return squareTr.decision()[0];
        } else return squareTr.decision()[1];
    }
}