package punto13;

import java.util.ArrayList;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected ArrayList<Rol> roles;

    public Persona(String nombre, String apellido, String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.roles= new ArrayList<>();
    }

    public void anadirRol(Rol rol){
        this.roles.add(rol);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Rol> getRoles() {
        return roles;
    }
}
