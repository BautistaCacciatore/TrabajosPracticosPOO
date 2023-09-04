package poo.punto8;
import java.util.Random;

public class Password {
    private int longitud= 8;
    private String contraseña;
    private boolean fuerte= false;

    /*Constructor*/
    public Password(int longitud1){
        setLongitud(longitud1);
        setContraseña(crearContraseña(getLongitud()));
        if (esFuerte()==true){
            fuerte= true;
        }
    }

    /*Setters*/
    public void setLongitud(int longitud1){
        this.longitud= longitud1;
    }

    public void setContraseña(String contraseña1){
        this.contraseña= contraseña1;
    }

    /*Getters*/
    public String getContraseña(){
        return contraseña;
    }

    public int getLongitud(){
        return longitud;
    }

    private String crearContraseña(int longitud){
        String caracteres_posibles= "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        String contraseña= "";
        Random random = new Random();

        for (int i= 0; i<longitud; i++){
            int posicion = random.nextInt(caracteres_posibles.length());
            char caracter= caracteres_posibles.charAt(posicion);
            contraseña += caracter;
        }
        return contraseña;
    }

    public void modificarLongitud(int longitud1){
        setLongitud(longitud1);
        System.out.println("LA LONGITUD DE LA CONTRASEÑA FUE MODIFICADA, POR LO QUE SE CREARA UNA NUEVA.");
        setContraseña(crearContraseña(getLongitud()));
    }

    public boolean esFuerte(){
        String contraseña= getContraseña();
        int mayus=0;
        int minus=0;
        int nums=0;
        for (int i=0; i< contraseña.length(); i++){
            char caracter= contraseña.charAt(i);
            String cadena= Character.toString(caracter);
            if (cadena.equals("0") || cadena.equals("1") || cadena.equals("2") || cadena.equals("3") || cadena.equals("4") || cadena.equals("5")|| cadena.equals("6") || cadena.equals("7") || cadena.equals("8") || cadena.equals("9")){
                nums+=1;
            }
            else{
                if (cadena.equals("a") || cadena.equals("b") || cadena.equals("c") || cadena.equals("d") || cadena.equals("e") || cadena.equals("f")|| cadena.equals("g") || cadena.equals("h") || cadena.equals("i") || cadena.equals("j") || cadena.equals("k") || cadena.equals("l") || cadena.equals("m") || cadena.equals("n") || cadena.equals("ñ")|| cadena.equals("o") || cadena.equals("p") || cadena.equals("q") || cadena.equals("r") || cadena.equals("s") || cadena.equals("t") || cadena.equals("u") || cadena.equals("v") || cadena.equals("w") || cadena.equals("x") || cadena.equals("y") || cadena.equals("z")){
                    minus+=1;
                }
                else{
                    mayus+=1;
                }
            }
        }

        if ((mayus>2) && (minus>1) && (nums>=2)){
            fuerte= true;
            return true;
        }
        else{
            fuerte= false;
            return false;
        }
    }

    public void regenerarContraseña(){
        boolean fuerte= esFuerte();
        if (fuerte==false){
            while (fuerte==false){
                setContraseña(crearContraseña(getLongitud()));
                fuerte= esFuerte();
            }
            System.out.println("CONTRASEÑA REGENERADA CON EXITO");
        }
        else{
            System.out.println("LA CONTRASEÑA NO PUEDE SER REGENERADA YA QUE SE CONSIDERA FUERTE");
        }
    }

    public void mostrarContraseña(){
        String fuerte= "";
        if (esFuerte()==true){
            fuerte= "Fuerte";
        }
        else{
            fuerte= "Debil";
        }
        System.out.println("< " + contraseña + " > - " + fuerte);
    }


}
