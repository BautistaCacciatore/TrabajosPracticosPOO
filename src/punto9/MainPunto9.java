package punto9;

public class MainPunto9 {
    public static void main(String[] args) {
        ListadoFormas lista= new ListadoFormas();
        Circulo c= new Circulo(4);
        Rectangulo r= new Rectangulo(3, 6);
        Cuadrado cua= new Cuadrado(8);
        Triangulo t= new Triangulo(4, 8);
        lista.agregarForma(c);
        lista.agregarForma(r);
        lista.agregarForma(cua);
        lista.agregarForma(t);
        Esfera e= new Esfera(9);
        Paralelepipedo par= new Paralelepipedo(3, 12, 1);
        Cubo cub= new Cubo(22);
        Tetraedro tet= new Tetraedro(11);
        lista.agregarForma(e);
        lista.agregarForma(par);
        lista.agregarForma(cub);
        lista.agregarForma(tet);
        lista.areaFiguras2D();
        System.out.println("");
        lista.areaFiguras3D();

    }
}
