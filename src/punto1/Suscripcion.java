package punto1;

import java.util.ArrayList;

public class Suscripcion {
    private TipoSuscripcion tipo;
    private ArrayList<String> actividades;

    /*Constructor*/
    public Suscripcion(TipoSuscripcion tipo) {
        setTipo(tipo);
        setActividades(new ArrayList<>());

        // Asignar las actividades según el tipo de suscripción
        if (getTipo().equals(TipoSuscripcion.BASICA)){
            actividades.add("Prioridad en compra de entradas");
            actividades.add("Descuento en compra de entradas");
        }
        else{
            if (getTipo().equals(TipoSuscripcion.INTERMEDIA)){
                actividades.add("Prioridad en compra de entradas");
                actividades.add("Descuento en compra de entradas");
                actividades.add("Acceso gratuito a las canchas del club");
                actividades.add("Acceso gratuito al gimnasio del club");
            }
            else{
                if (getTipo().equals(TipoSuscripcion.DESTACADA)){
                    actividades.add("Acceso gratuito a los partidos");
                    actividades.add("Participacion en sorteos mensuales");
                    actividades.add("Acceso gratuito a las canchas del club");
                    actividades.add("Acceso gratuito al gimnasio del club");
                }
                else{
                    System.out.println("TIPO DE SUSCRIPCION INVALIDO");
                }
            }
        }
    }

    /*Setters*/
    public void setTipo(TipoSuscripcion tipo) {
        this.tipo = tipo;
    }
    public void setActividades(ArrayList<String> actividades) {
        this.actividades = actividades;
    }

    /*Getters*/
    public TipoSuscripcion getTipo() {
        return tipo;
    }
    public ArrayList<String> getActividades() {
        return actividades;
    }

    public void mostrarActividades(){
        for (int i=0; i<actividades.size(); i++){
            System.out.println(actividades.get(i));
        }
    }

}
