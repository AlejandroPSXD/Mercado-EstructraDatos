/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Alejandro P
 */
public class Mercado {

    private final Cola colaClientes1 = new Cola();
    private final Cola colaClientes2 = new Cola();
    private final Cola colaClientes3 = new Cola();
    private final Cola colaClientes4 = new Cola();//cola de clientes
    private int contadorAtendidos1;
    private int contadorAtendidos2;
    private int contadorAtendidos3;
    private int contadorAtendidos4;

    public Mercado() {
        contadorAtendidos1 = 0;
        contadorAtendidos2 = 0;
        contadorAtendidos3 = 0;
        contadorAtendidos4 = 0;
    }

    public void imprimir(JList jlist1, JList jlist2, JList jlist3, JList jlist4) {

        colaClientes1.mostrar(jlist1);
        colaClientes2.mostrar(jlist2);
        colaClientes3.mostrar(jlist3);
        colaClientes4.mostrar(jlist4);
    }

    public void atender1(JLabel atendidos) {
        if (colaClientes1.extraer()) {
            contadorAtendidos1++;
        }
        atendidos.setText("" + contadorAtendidos1);
    }

    public void atender2(JLabel atendidos) {
        if (colaClientes2.extraer()) {
            contadorAtendidos2++;
        }
        atendidos.setText("" + contadorAtendidos2);
    }

    public void atender3(JLabel atendidos) {
        if (colaClientes3.extraer()) {
            contadorAtendidos3++;
        }

        atendidos.setText("" + contadorAtendidos3);
    }
        
    public void atender4(JLabel atendidos) {
        if (colaClientes4.extraer()) {
            contadorAtendidos4++;
        }

        atendidos.setText("" + contadorAtendidos4);
    }

    public float calcularSaldo() {
        return colaClientes1.saldo() + colaClientes2.saldo() + colaClientes3.saldo();
    }

    /**
     * Metodo para personalizar el ingreso de clientes a las colas del mercado
     *
     * @param cliente
     */
    public void ingresarCliente(Cliente cliente) {

        switch (cliente.caja) {
            case 1:
                colaClientes1.insertar(cliente);
                break;
            case 2:
                colaClientes2.insertar(cliente);
                break;
            case 3:
                colaClientes3.insertar(cliente);
                break;
            case 4:
                colaClientes4.insertar(cliente);
                break;
        }
    }

    void mostrarCuentas(JLabel jLnumero1, JLabel jLnumero2, JLabel jLnumero3, JLabel jLnumero4) {
        jLnumero1.setText("" + colaClientes1.contar());
        jLnumero2.setText("" + colaClientes2.contar());
        jLnumero3.setText("" + colaClientes3.contar());
        jLnumero4.setText("" + colaClientes4.contar());
    }

    void mostrarSaldos(JLabel saldo1, JLabel saldo2, JLabel saldo3, JLabel saldo4) {
        saldo1.setText("" + colaClientes1.saldo());
        saldo2.setText("" + colaClientes2.saldo());
        saldo3.setText("" + colaClientes3.saldo());
        saldo4.setText("" + colaClientes4.saldo());
    }

}
