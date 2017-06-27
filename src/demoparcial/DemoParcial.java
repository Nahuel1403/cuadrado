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
public class DemoParcial {

    static void ejercicio5() {
        ArrayList<SuperficiePlana> figuras = new ArrayList<>();
        Double sumatoriaAreas = 0.0;
        for (int i = 0; i < 10; i++) {
            SuperficiePlana tetra = new Tetraedro(Math.random() * 10);
            SuperficiePlana icosa = new Icosaedro(Math.random() * 10);
            SuperficiePlana cuadrado = new Cuadrado(Math.random() * 10);
            SuperficiePlana triangulo = new TrianguloEquilatero(Math.random() * 10);
            sumatoriaAreas += tetra.calcularArea();
            sumatoriaAreas += icosa.calcularArea();
            sumatoriaAreas += cuadrado.calcularArea();
            sumatoriaAreas += triangulo.calcularArea();
            figuras.add(tetra);
            figuras.add(icosa);
            figuras.add(cuadrado);
            figuras.add(triangulo);
        }
        System.out.println(sumatoriaAreas / figuras.size());
    }

    static void ejercicio6() {
        ArrayList<SuperficiePlana> figuras = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i < 3) {
                SuperficiePlana tetra = new Tetraedro(Math.random() * 10);
                figuras.add(tetra);
            }
            if (i < 12) {
                SuperficiePlana triangulo = new TrianguloEquilatero(Math.random() * 10);
                figuras.add(triangulo);
            }
            if( i < 7){
                SuperficiePlana cuadrado = new Cuadrado(Math.random() * 10);
                figuras.add(cuadrado);
            }
            
            SuperficiePlana icosa = new Icosaedro(Math.random() * 10);
            figuras.add(icosa);
        }
        for(SuperficiePlana s : figuras){
            if(s instanceof FiguraBidimensional){
                System.out.println(((FiguraBidimensional)s).calcularPerimetro());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoParcial.ejercicio5();
        DemoParcial.ejercicio6();
    }

}
