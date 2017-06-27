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
public class Icosaedro extends PoliedroRegular {

    private static ArrayList<FiguraBidimensional> crearTriangulos(Double longitudLados) {
        ArrayList<FiguraBidimensional> caras = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(longitudLados);
            caras.add(trianguloEquilatero);
        }
        return caras;
    }

    public Icosaedro(Double longitudAristas) {
        super(Icosaedro.crearTriangulos(longitudAristas));
    }

    @Override
    public Double calcularVolumen() {
        return ((double) 5 / (double) 12) * (3 + Math.sqrt(5)) * Math.pow(this.getLongitudAristas(), 3);
    }

    @Override
    public Double calcularArea() {
        return 5* Math.sqrt(3)* Math.pow(this.getLongitudAristas(), 2);
    }

}
