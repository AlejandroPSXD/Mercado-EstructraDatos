/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Alejandro P
 */
public class Productos {

    class Nodo {

        String producto;
        float precio;
        Nodo sig;
    }

    private Nodo raiz;

    public Productos() {
        raiz = null;
    }

    public void insertar(String p, float x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.producto = p;
        nuevo.precio = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public String extraer() {
        if (raiz != null) {
            String informacion = raiz.producto;
            raiz = raiz.sig;
            return informacion;
        } else {
            return null;
        }
    }
    
    public int len(){
        Nodo reco = raiz;
        int total = 0;
        while (reco != null) {
            total++;
            reco = reco.sig;
        }
        return total;
    }

    public double pagototal() {
        Nodo reco = raiz;
        double total = 0;
        while (reco != null) {
            total = total + reco.precio;
            reco = reco.sig;
        }
        return total;
    }
}
