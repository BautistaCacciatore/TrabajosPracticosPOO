package punto9;

import java.util.ArrayList;

public class ListadoFormas {
    private ArrayList<FiguraDosDimensiones> figuras2D;
    private ArrayList<FiguraTresDimensiones> figuras3D;

    public ListadoFormas() {
        this.figuras2D = new ArrayList<>();
        this.figuras3D = new ArrayList<>();
    }

    public ArrayList<FiguraDosDimensiones> getFiguras2D() {
        return figuras2D;
    }
    public ArrayList<FiguraTresDimensiones> getFiguras3D() {
        return figuras3D;
    }

    public void agregarForma(FiguraDosDimensiones figura){
        figuras2D.add(figura);
    }

    public void agregarForma(FiguraTresDimensiones figura){
        figuras3D.add(figura);
    }

    public void areaFiguras2D(){
        System.out.println("AREAS DE TODAS LAS FIGURAS 2D DE LA LISTA: ");
        for (int i= 0; i<figuras2D.size(); i++){
            System.out.println("AREA: " + figuras2D.get(i).getArea());
        }
    }

    public void areaFiguras3D(){
        System.out.println("VOLUMEN DE TODAS LAS FIGURAS 3D DE LA LISTA: ");
        for (int i= 0; i<figuras3D.size(); i++){
            System.out.println("VOLUMEN: " + figuras3D.get(i).getVolumen());
        }
    }

}
