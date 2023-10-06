package punto9;

public class Circulo extends FiguraDosDimensiones {
    private double radio;

    public Circulo(double radio){
        this.radio= radio;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
