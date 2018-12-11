/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eayo.modelo;

import javafx.scene.shape.Circle;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Circulo {
    private int h;
    private int k;
    private int radio;

    public Circulo() {
    }

    public Circulo(int h, int k, int radio) {
        this.h = h;
        this.k = k;
        this.radio = radio;
    }
  
    
    public void AreaCirculo(){
         setH(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada del punto en x:")));
         setK(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada del punto en y:")));
         setRadio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo:")));
         int X1 = -(2*(h));
         int x2= ((h)*(h));
         int Y1 = -(2*(k));
         int Y2= ((k)*(k));
         int radiocuadrado=radio*radio;
         int suma=(x2)+(Y2);
         int resta= suma-radiocuadrado;
         JOptionPane.showMessageDialog(null,"La ecuacion de la circunferencia es:  " +  " x2 + y2 " 
                 + X1+"x "+Y1+"y "+resta+" = 0");
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the k
     */
    public int getK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(int k) {
        this.k = k;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the h
     */
 }
