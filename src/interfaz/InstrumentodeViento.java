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
public class InstrumentodeViento implements InstrumentoMusical {

    public InstrumentodeViento() {
    }

    @Override
    public void tocar() {
        System.out.println("Estoy tocando un instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando un instrumento");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentodeViento{" + '}';
    }
}
