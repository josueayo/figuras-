/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lchaqui.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Triangulo {
   private int base;
   private int altura;
   private int c;

    public Triangulo(int base, int altura, int c) {
        this.base = base;
        this.altura = altura;
        this.c = c;
    }

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void AreaTriangulo(){
        setBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:")));
        setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:")));
        setC(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer lado del Triangulo:")));
        int resultado=(getBase()*getAltura())/2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es: " + resultado);
    }
    public void Perimetro(){
        int resul=getBase()+getAltura()+getC();
        JOptionPane.showMessageDialog(null,"El perímetro del triangulo es:"  +  resul);
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }
  
}
