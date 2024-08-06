/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;


public class Circulo {
    int radio; // Atributo que define el radio de un circulo
    /**
    * Constructor de la clase Circulo
    * @param radio Parametro que define el radio de un circulo
    */
    Circulo(int radio) {
    this.radio = radio;
    }
    /**
    * Método que calcula y devuelve el área de un circulo como pi
    * multiplicado por el radio al cuadrado
    * @return Área de un circulo
    */
    double calcularArea() {
    return Math.PI*Math.pow(radio,2);
    }
    /**
    * Método que calcula y devuelve el perímetro de un circulo como la
    * multiplicación de pi por el radio por 2
    * @return Perímetro de un circulo
    */
    double calcularPerimetro() {
    return 2*Math.PI*radio;
    }

}
