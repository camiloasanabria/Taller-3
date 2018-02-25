/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import Clase1.ClaseA;
import Clase2.ClaseB;
import Clase3.ClaseC;
/**
 * version 1.0
 * @author cass4
 * 25/02/2018
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
        System.out.println("        CLASE 2");
        //objetos de la Clase2
        ClaseB clase2Objeto1 = new ClaseB();
        ClaseB clase2Objeto2 = new ClaseB();
        ClaseB clase2Objeto3 = new ClaseB();
        //objeto1 de la ClaseB
        System.out.println("-------------------------");
        System.out.println("OBJETO 1");
        System.out.println("toString: "+clase2Objeto1.toString());
        System.out.println("ENTERO INICIAL:   "+clase2Objeto1.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase2Objeto1.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase2Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase2Objeto1.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase2Objeto1.retornarDobol2());
        clase2Objeto1.entero = 30;
        clase2Objeto1.cadena = "CADENA 2 OBJETO 1";
        clase2Objeto1.dobol1 = 2.21;
        clase2Objeto1.flotante = 21.2F;
        clase2Objeto1.dobol2 = 31.4;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase2Objeto1.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase2Objeto1.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase2Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase2Objeto1.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase2Objeto1.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto2 de la ClaseB
        System.out.println("-------------------------");
        System.out.println("OBJETO 2");
        System.out.println("toString: "+clase2Objeto2.toString());
        System.out.println("ENTERO INICIAL:   "+clase2Objeto2.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase2Objeto2.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase2Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase2Objeto2.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase2Objeto2.retornarDobol2());
        clase2Objeto2.entero = 150;
        clase2Objeto2.cadena = "CADENA 2 OBJETO 2";
        clase2Objeto2.dobol1 = 1.345;
        clase2Objeto2.flotante = 2.43F;
        clase2Objeto2.dobol2 = 3.55;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase2Objeto2.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase2Objeto2.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase2Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase2Objeto2.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase2Objeto2.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto3 de la ClaseB
        System.out.println("-------------------------");
        System.out.println("OBJETO 3");
        System.out.println("toString: "+clase2Objeto3.toString());
        System.out.println("ENTERO INICIAL:   "+clase2Objeto3.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase2Objeto3.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase2Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase2Objeto3.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase2Objeto3.retornarDobol2());
        clase2Objeto3.entero = 208;
        clase2Objeto3.cadena = "CADENA 2 OBJETO 3";
        clase2Objeto3.dobol1 = 1.44;
        clase2Objeto3.flotante = 2.57F;
        clase2Objeto3.dobol2 = 3.66;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase2Objeto3.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase2Objeto3.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase2Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase2Objeto3.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase2Objeto3.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        System.out.println("        CLASE 3");
        //objetos de la Clase3
        ClaseC clase3Objeto1 = new ClaseC();
        ClaseC clase3Objeto2 = new ClaseC();
        ClaseC clase3Objeto3 = new ClaseC();
        //objeto1 de la ClaseC
        System.out.println("-------------------------");
        System.out.println("OBJETO 1");
        System.out.println("toString: "+clase3Objeto1.toString());
        System.out.println("ENTERO INICIAL:   "+clase3Objeto1.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase3Objeto1.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase3Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase3Objeto1.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase3Objeto1.retornarDobol2());
        clase3Objeto1.entero = 302;
        clase3Objeto1.cadena = "CADENA 3 OBJETO 1";
        clase3Objeto1.dobol1 = 2.212;
        clase3Objeto1.flotante = 21.24F;
        clase3Objeto1.dobol2 = 31.45;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase3Objeto1.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase3Objeto1.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase3Objeto1.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase3Objeto1.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase3Objeto1.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto2 de la ClaseC
        System.out.println("-------------------------");
        System.out.println("OBJETO 2");
        System.out.println("toString: "+clase3Objeto2.toString());
        System.out.println("ENTERO INICIAL:   "+clase3Objeto2.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase3Objeto2.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase3Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase3Objeto2.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase3Objeto2.retornarDobol2());
        clase3Objeto2.entero = 120;
        clase3Objeto2.cadena = "CADENA 3 OBJETO 2";
        clase3Objeto2.dobol1 = 1.115;
        clase3Objeto2.flotante = 5.63F;
        clase3Objeto2.dobol2 = 3.56;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase3Objeto2.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase3Objeto2.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase3Objeto2.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase3Objeto2.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase3Objeto2.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        //objeto3 de la ClaseC
        System.out.println("-------------------------");
        System.out.println("OBJETO 3");
        System.out.println("toString: "+clase3Objeto3.toString());
        System.out.println("ENTERO INICIAL:   "+clase3Objeto3.retornarEntero());
        System.out.println("CADENA INICIAL:   "+clase3Objeto3.retornarCadena());
        System.out.print("DOBOL1 INICIAL:   ");clase3Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE INICIAL: "+clase3Objeto3.retornarFlotante());
        System.out.println("DOBOL2 INICIAL:   "+clase3Objeto3.retornarDobol2());
        clase3Objeto3.entero = 258;
        clase3Objeto3.cadena = "CADENA 3 OBJETO 3";
        clase3Objeto3.dobol1 = 1.344;
        clase3Objeto3.flotante = 6.67F;
        clase3Objeto3.dobol2 = 5.67;
        System.out.println();
        System.out.println("ENTERO MODIFICADO:   "+clase3Objeto3.retornarEntero());
        System.out.println("CADENA MODIFICADA:   "+clase3Objeto3.retornarCadena());
        System.out.print("DOBOL1 MODIFICADO:   ");clase3Objeto3.imprimirDobol1();
        System.out.println("FLOTANTE MODIFICADO: "+clase3Objeto3.retornarFlotante());
        System.out.println("DOBOL2 MODIFICADO:   "+clase3Objeto3.retornarDobol2());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
    }
    
}
