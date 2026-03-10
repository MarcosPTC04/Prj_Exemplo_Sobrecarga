/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjexemplosobrecarga;

/**
 *
 * @author Marcos
 */
public class Calculadora {
    
    public Calculadora(){
        int valor = 5 + 4;
        System.out.println("Valor: "+ valor);
    }
    
    public Calculadora(int nro1, int nro2){
        int valor = nro1 + nro2;
        System.out.println("Valor: "+ valor);
    }
    
    public void somar(int nro1, int nro2){
        int valor = nro1 + nro2;
        System.out.println("Valor: "+ valor);
    }
    
    public void somar(int nro1, int nro2, int nro3){
        int valor = nro1 + nro2 + nro3;
        System.out.println("Valor: "+ valor);
    }
    
    public void somar(int nro1, float nro2){
        float valor = nro1 + nro2;
        System.out.println("Valor: "+ valor);
    }
    
    public void somar(float nro1, int   nro2){
        float valor = nro1 + nro2;
        System.out.println("Valor: "+ valor);
    }
    
}

