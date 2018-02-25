/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import Clase1.ClaseA;

/**
 * 
 * @author cass4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("        CLASE 1");
        //objetos de la Clase1
        ClaseA clase1Objeto1 = new ClaseA();
        ClaseA clase1Objeto2 = new ClaseA();
        ClaseA clase1Objeto3 = new ClaseA();
        //objeto1 de la ClaseA
        System.out.println("-------------------------");
        System.out.println("OBJETO 1");
        System.out.println("toString: "+clase1Objeto1.toString());
        System.out.println("ENTERO INICIAL:   "+clase1Objeto1.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase1Objeto1.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase1Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase1Objeto1.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase1Objeto1.retornarDobol2());
        clase1Objeto1.entero = 10;
        clase1Objeto1.cadena = "CADENA 1 OBJETO 1";
        clase1Objeto1.dobol1 = 1.2;
        clase1Objeto1.flotante = 2.3F;
        clase1Objeto1.dobol2 = 3.4;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase1Objeto1.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase1Objeto1.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase1Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase1Objeto1.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase1Objeto1.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto2 de la ClaseA
        System.out.println("-------------------------");
        System.out.println("OBJETO 2");
        System.out.println("toString: "+clase1Objeto2.toString());
        System.out.println("ENTERO INICIAL:   "+clase1Objeto2.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase1Objeto2.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase1Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase1Objeto2.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase1Objeto2.retornarDobol2());
        clase1Objeto2.entero = 15;
        clase1Objeto2.cadena = "CADENA 1 OBJETO 2";
        clase1Objeto2.dobol1 = 1.3;
        clase1Objeto2.flotante = 2.4F;
        clase1Objeto2.dobol2 = 3.5;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase1Objeto2.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase1Objeto2.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase1Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase1Objeto2.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase1Objeto2.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto3 de la ClaseA
        System.out.println("-------------------------");
        System.out.println("OBJETO 3");
        System.out.println("toString: "+clase1Objeto3.toString());
        System.out.println("ENTERO INICIAL:   "+clase1Objeto3.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase1Objeto3.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase1Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase1Objeto3.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase1Objeto3.retornarDobol2());
        clase1Objeto3.entero = 20;
        clase1Objeto3.cadena = "CADENA 1 OBJETO 3";
        clase1Objeto3.dobol1 = 1.4;
        clase1Objeto3.flotante = 2.5F;
        clase1Objeto3.dobol2 = 3.6;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase1Objeto3.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase1Objeto3.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase1Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase1Objeto3.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase1Objeto3.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        
    }
    
}
