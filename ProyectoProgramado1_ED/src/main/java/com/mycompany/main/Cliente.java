/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Alejandro P
 */
public class Cliente {

    public String nombre;
    public int caja;
    public float valorApagar;
    
    public String producto1;
    public String producto2;
    public String producto3;
    public String producto4;
    public String producto5;
    
    public float preciop1;
    public float preciop2;
    public float preciop3;
    public float preciop4;
    public float preciop5;
    
    

    /**
     * Metodo Constructor
     *
     * @param nombre
     * @param caja
     * @param valorApagar
     */
    public Cliente(String nombre, int caja, float valorApagar/*, String producto1, String producto2, String producto3, String producto4, String producto5*/) {
        this.nombre = nombre;
        this.caja = caja;
        this.valorApagar = valorApagar;
        /*this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;
        this.producto5 = producto5;*/
    }

}
