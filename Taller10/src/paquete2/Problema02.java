/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int menores = 0;
        int[] adultos = new int[3];
        int suma;
        String reporte = "";

        for (int fila = 0; fila < edades.length; fila++) {
            suma = 0;
            for (int col = 0; col < edades[fila].length; col++) {

                if (edades[fila][col] < 18) {
                    menores = menores + 1;

                } else {
                    suma += 1;
                }
            }
            adultos[fila] = suma;

        }
        for (int fila = 0; fila < edades.length; fila++) {
            reporte = String.format("%sEn la familia %s hay %s adultos\n", reporte, fila + 1,
                    adultos[fila]);

        }
        System.out.printf("%s\nEntre todas las familias hay %s niños", reporte, menores);

    }
}
