package Services;

import Entities.Cadena;

import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena(){

        Cadena myCadena = new Cadena();
        System.out.print("Ingrese la cadena a evaluar: ");
        myCadena.setFrase(leer.next());
        myCadena.setLongitud(myCadena.getFrase().length());
        return myCadena;

    }

    public int contarVocales(Cadena cadena){

        String minusculas = cadena.getFrase().toLowerCase();
        cadena.setVocales((int) minusculas.chars().filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        .count());
        return cadena.getVocales();
    }

    public String invertirFrase(Cadena cadena){

        String cadenaO=cadena.getFrase();
        String cadenaI = "";

        for (int i = cadenaO.length()-1; i>=0 ; i--) {
             cadenaI = cadenaI.concat(String.valueOf(cadenaO.charAt(i)));
        }
        cadena.setFraseInvertida(cadenaI);

        return cadena.getFraseInvertida();
    }

    public int vecesRepetido(Cadena cadena, char caracter){

        String minusculas = cadena.getFrase();
        return (int) minusculas.chars().filter(c -> c == caracter ).count();

    }

    public String reemplazar(Cadena cadena, String reemplazo){

        String cadenaO=cadena.getFrase();
        String cadenaI = "";

        for (int i =0; i<cadenaO.length(); i++) {
            cadenaI = cadenaO.charAt(i) == 'a' ? cadenaI.concat(reemplazo) : cadenaI.concat(String.valueOf(cadenaO.charAt(i)));
        }

        return cadenaI;
    }
}
