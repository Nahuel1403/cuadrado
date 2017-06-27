/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparcial;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends PoligonoRegular {

    @Override
    public Double calcularArea() {
        return Math.pow(getLongitudLado(), 2);
    }

    public Cuadrado(Double longitudLado) {
        super(4, longitudLado);
    }
        
}
