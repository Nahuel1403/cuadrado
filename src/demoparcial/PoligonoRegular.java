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
public abstract class PoligonoRegular implements FiguraBidimensional{
    private Integer cantidadLados;
    private Double longitudLado;

    protected PoligonoRegular(Integer cantidadLados, Double longitudLado) {
        this.cantidadLados = cantidadLados;
        this.longitudLado = longitudLado;
    }

    @Override
    public Double calcularPerimetro() {
        return this.getCantidadLados() * this.getLongitudLado();
    }

    /**
     * @return the cantidadLados
     */
    public Integer getCantidadLados() {
        return cantidadLados;
    }

    /**
     * @return the longitudLado
     */
    public Double getLongitudLado() {
        return longitudLado;
    }
       
}
