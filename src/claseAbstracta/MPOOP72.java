/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author HP
 */
public class MPOOP72 {
    //psvm
    public static void main(String[] args) {
        System.out.println("3*********************");
        //Clase abstracta
        //Poligono poligono = new Poligono(); linea incorrecta
        Poligono poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
}
