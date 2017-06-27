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
public class Tetraedro extends PoliedroRegular {

    private static ArrayList<FiguraBidimensional> crearTriangulos(Double longitudLados) {
        ArrayList<FiguraBidimensional> caras = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(longitudLados);
            caras.add(trianguloEquilatero);
        }
        return caras;
    }

    @Override
    public Double calcularVolumen() {
        return (Math.sqrt(2) / 12) * Math.pow(this.getLongitudAristas(), 3);
    }

    @Override
    public Double calcularArea() {
        return Math.sqrt(3) * Math.pow(this.getLongitudAristas(), 2);
    }

    public Tetraedro(Double longitudArista) {
        super(Tetraedro.crearTriangulos(longitudArista));
    }
}
