/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JList;

/**
 *
 * @author Alejandro P
 */
public class Cola {

    private Nodo raiz;

    /**
     * Metodo para mostrar en una lista los nodos de una cola
     *
     * @param lista
     */
    public void mostrar(JList lista) {
        Nodo temporal = raiz;
        String[] strings = new String[10];
        int contado = 0;
        while (temporal != null) {
            strings[contado] = temporal.info.nombre + "(" + temporal.info.valorApagar + ")";
            contado++;
            temporal = temporal.siguiente;
        }
        lista.setModel(new javax.swing.AbstractListModel() {

            @Override
            public int getSize() {
                return strings.length;
            }

            @Override
            public Object getElementAt(int i) {
                return strings[i];
            }
        });
    }

    /**
     * Metodo para comparar si la cola esta vacia
     *
     * @return
     */
    public boolean vacia() {
        return raiz == null;
    }

    /**
     * Metodo para ingresar elementos en una cola
     *
     * @param info
     */
    public void insertar(Cliente info) {
        Nodo nuevo = new Nodo(info);
        if (vacia()) {
            raiz = nuevo;
        } else {
            Nodo temporal = raiz;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo;
        }
    }

    /**
     * Metodo para quitar elementos de la cola
     *
     * @return
     */
    public boolean extraer() {
        if (!vacia()) {
            raiz = raiz.siguiente;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para contar el numero de elementos de la cola
     *
     * @return
     */
    public int contar() {
        Nodo temporal = raiz;
        int contar = 0;
        while (temporal != null) {
            contar++;
            temporal = temporal.siguiente;
        }
        return contar;
    }

    /**
     * Metodo para sumar el saldo acomulado
     *
     * @return
     */
    public float saldo() {
        Nodo temporal = raiz;
        float saldo = 0;
        while (temporal != null) {
            saldo += temporal.info.valorApagar;
            temporal = temporal.siguiente;
        }
        return saldo;
    }

    /**
     * Clase Nodo para la Cola Enlazada
     */
    public static class Nodo {

        Cliente info;
        Nodo siguiente;

        public Nodo(Cliente info) {
            this.info = info;
        }
    }
}
