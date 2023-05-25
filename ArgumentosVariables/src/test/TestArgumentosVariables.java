/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author JOSE
 */
public class TestArgumentosVariables {
    public static void main(String[] args){
        Imprimirnumeros(3,4,5);
        Imprimirnumeros(1,2);
        variosParametros("Juan", 8,9,10);
        
    }
    private static void variosParametros(String nombre, int...numeros){//el parametro int... debe ser siempre el ultimo
        System.out.println("Nombre: " + nombre);
        Imprimirnumeros(numeros);
        
    }
    private static void Imprimirnumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: "+ numeros[i]);
            
        }
        
        
    }
    
}
