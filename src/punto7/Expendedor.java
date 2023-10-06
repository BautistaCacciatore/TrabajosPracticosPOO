package punto7;

public class Expendedor {
    private int codigo;
    private Combustible combustible;

    /*Constructor*/
    public Expendedor(int codigo, Combustible combustible){
        setCodigo(codigo);
        setCombustible(combustible);
    }

    /*Setters*/
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    private void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    /*Getters*/
    public int getCodigo(){
        return this.codigo;
    }
    public Combustible getCombustible() {
        return combustible;
    }

}
