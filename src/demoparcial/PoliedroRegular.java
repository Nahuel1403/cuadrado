/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparcial;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class PoliedroRegular implements FiguraTridimensional{
    protected ArrayList<FiguraBidimensional> caras;

    protected PoliedroRegular(ArrayList<FiguraBidimensional> caras) {
        this.caras = caras;
    }
    
    public Double getLongitudAristas(){
        return ((PoligonoRegular)this.caras.get(0)).getLongitudLado();
    }
    
    public Integer getCantidadCaras(){
        return this.caras.size();
    }
}
