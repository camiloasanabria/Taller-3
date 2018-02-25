/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

/**
 * version 1.0
 * @author cass4
 * 25/02/2018
 */
public class ClaseC {
    public int entero = 15;
    public String cadena = "CADENA 3";
    public double dobol1 = 2.241;
    public float flotante = 2.252F;
    public double dobol2 = 3.314;
    /**
     * retornar valor de entero
     * @return entero
     */
    public int retornarEntero(){
        return entero;
    }
    /**
     * retornar valor de cadena
     * @return string
     */
    public String retornarCadena(){
        return cadena;
    }
    /**
     * imprimir valor de dobol1
     */
    public void imprimirDobol1(){
        System.out.println(dobol1);
    }
    /**
     * retornar valor de flotante
     * @return float
     */
    public float retornarFlotante(){
        return flotante;
    }
    /**
     * retornar valor de dobol2
     * @return double
     */
    public double retornarDobol2(){
        return dobol2;
    }
    @Override
    public String toString(){
        return entero+" / "+cadena+" / "+dobol1+" / "+flotante+" / "+dobol2;
    }
}
