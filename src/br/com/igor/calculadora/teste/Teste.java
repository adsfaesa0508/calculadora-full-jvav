/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igor.calculadora.teste;

import br.com.igor.calculadora.gui.CalculadoraGui;
import br.com.igor.calculadora.logico.Logica;

/**
 *
 * @author usuario
 */
public class Teste {
    public static void main(String[] args) {
        new CalculadoraGui().setVisible(true);
        System.out.println(Logica.calcula("18*-1*-1"));

        System.out.println(Logica.calcula("-18*-1*-1"));

        System.out.println(Logica.calcula("2+4+61/-67"));

        System.out.println(Logica.calcula("5*-1+2"));
    }
}
