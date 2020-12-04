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
public class Triangulo extends Poligono{
    private int alpha, beta ,gamma;
    private float a,b,c,base,altura;

    public Triangulo() {
    }

    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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
        return "Triangulo{" + "alpha=" + alpha 
                + ", beta=" + beta 
                + ", gamma=" + gamma 
                + ", a=" + a + ", b=" + b 
                + ", c=" + c + ", base=" + base 
                + ", altura=" + altura + '}';
    }
    
    @Override
    public float area(){
        return (base*altura)/2;
    }
    
    @Override
    public float perimetro(){
        return a+b+c;
    }
}
