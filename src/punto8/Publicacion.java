package punto8;

public class Publicacion {
    private String nombre;
    private String editor;
    private String telefonoProveedor;

    /*Constructor*/
    public Publicacion(String nombre, String editor, String telefonoProveedor){
        setNombre(nombre);
        setEditor(editor);
        setTelefonoProveedor(telefonoProveedor);
    }

    /*Setters*/
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected void setEditor(String editor) {
        this.editor = editor;
    }
    protected void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public String getEditor() {
        return editor;
    }
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }
}
