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
public class TrianguloEquilatero extends PoligonoRegular {

    @Override
    public Double calcularArea() {
        return (Math.sqrt(3)/4) * Math.pow(getLongitudLado(), 2);
    }

    public TrianguloEquilatero(Double longitudLado) {
        super(3, longitudLado);
    }
    
}
