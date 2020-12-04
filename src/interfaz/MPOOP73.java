/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author HP
 */
public class MPOOP73 {
    public static void main(String[] args) {
        System.out.println("4******************");
        //Interfaz
        
        //InstrumentoMusical instrumento = new IntrumentoMusical(); X
        
        InstrumentoMusical instrumento;
        instrumento = new InstrumentodeViento();
        instrumento.afinar();
        System.out.println(instrumento);
        
        instrumento = new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
    }
}
