import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

/*  
    Enunciado:

    Dada una cadena de texto (String) con el nombre completo de una persona, debes crear un método que devuelva 3 campos: nombre, apellido1, apellido2.

    Debes tener en cuenta que hay nombres compuestos y que puedes recibir un nombre completo sin apellido2 o sin ningún apellido. Ejemplos:

    José Martínez Pérez -> nombre: José, apellido1: Martínez, apellido2: Pérez.

    José María Martínez -> nombre: José María, apellido1: Martínez

    José -> nombre: José */
    String nombreCompleto = "José  Martínez Pérez";
    
    String[] nombres = clasificarNombres(separarNombres(nombreCompleto));;

   // mostrar(nombres);

    
   
    mostrar(nombres);
    

    }

    static String[] separarNombres(String nombreCompleto) {
        String []nombres = nombreCompleto.split(" ");
        return nombres;
    }

    static void mostrar(String []cadena){
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
    }

    
    static String[] clasificarNombres(String[] nombres) {
        String[] nombresClasificados = new String[3];
        for(int i = 0; i < nombres.length; i++){
            if(nombres.length == 1){
                nombresClasificados[0] = "Nombre: " + nombres[0];
            }else if(nombres.length == 2){
                nombresClasificados[0] = "Nombre: " + nombres[0];
                nombresClasificados[1] = "Apellido1: " + nombres[1];
            }else if(nombres.length == 3){
                nombresClasificados[0] = "Nombre: " + nombres[0];
                nombresClasificados[1] = "Apellido1: " + nombres[1];
                nombresClasificados[2] = "Apellido2: " + nombres[2];
            }else if(nombres.length == 4){
                nombresClasificados[0] = "Nombre: " + nombres[0] + " " + nombres[1];
                nombresClasificados[1] = "Apellido1: " + nombres[2];
                nombresClasificados[2] = "Apellido2: " + nombres[3];
            }
        }

        return nombresClasificados;
    }

}
