/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

import herencia.*;

/**
 *
 * @author HP
 */
public class Cuadrilatero extends Poligono{
    
    private int alpha, beta;
    private float a,b;
    private float base, altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha 
                + ", beta=" + beta + ", a=" + a 
                + ", b=" + b + ", base=" + base 
                + ", altura=" + altura + '}';
    }
    
    @Override
    public float area(){
        return base*altura;
    }
    
    @Override 
    public float perimetro(){
        return 2*a + 2*b;
    }
    
}
