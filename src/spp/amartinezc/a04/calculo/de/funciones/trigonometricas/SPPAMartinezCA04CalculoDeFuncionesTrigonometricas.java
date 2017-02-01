/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a04.calculo.de.funciones.trigonometricas;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class SPPAMartinezCA04CalculoDeFuncionesTrigonometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double angulo,anguloradianes, tangente, seno, coseno;
        int opEntrada;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Calculadora de tangente, seno y coseno de un ángulo");
        System.out.println("1. Calcular tangente");
        System.out.println("2. Calcular seno");
        System.out.println("3. Calcular coseno");
        System.out.println("4. Salir");
        opEntrada = kb.nextInt();
        
        
        switch(opEntrada) {
            case 1:
                System.out.println("Cálculo de tangente");
                System.out.println("Ingrese el ángulo (entre 0 y 360°)");
                angulo = Math.toRadians(kb.nextDouble());
                tangente= Math.tan(angulo);
                System.out.println("Tangente=" +tangente);
                break; 
            case 2:
                System.out.println("Cálculo de seno");
                System.out.println("Ingrese el ángulo (entre 0 y 360°)");
                angulo= Math.toRadians(kb.nextDouble());
                seno=Math.sin(angulo);
                System.out.println("Seno="+ seno);
                break;
            case 3:
                System.out.println("Cálculo de coseno");
                System.out.println("Ingrese el ángulo (entre 0 y 360°)");
                angulo= Math.toRadians(kb.nextDouble());
                coseno=Math.cos(angulo);
                System.out.println("Cos="+ coseno);
                break;
            case 4:
                System.out.println("Salir");
        }
    }
}