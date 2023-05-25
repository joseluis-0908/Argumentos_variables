package test;

import Enumeracion.Continentes;
import Enumeracion.Dias;

/**
 *
 * @author JOSE
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
        System.out.println(" dia 1: " + Dias.Lunes);
        System.out.println(" Continente 4: " + Continentes.America);
        System.out.println(" Numero de paises del 4 continente: " + Continentes.America.getPaises());
        
        System.out.println(" Continente 1: " + Continentes.Africa);
        System.out.println(" Numero de paises del 1S continente: " + Continentes.Africa.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case Lunes:
                System.out.println("Primer dia de la semana");
                break;
            case Martes:
                System.out.println("Segundo dia de la semana");
                break;
            case Miercoles:
                System.out.println("Tercer dia de la semana");
                break;
            case Jueves:
                System.out.println("Cuarto dia de la semana");
            case viernes:
                System.out.println("Quinto dia de la semana");
                break;
            case Sabado:
                System.out.println("sexto dia de la semana");
                break;
            case Domingo:
                System.out.println("Septimo dia de la semana");
                break;
            default:
        }

    }
}
