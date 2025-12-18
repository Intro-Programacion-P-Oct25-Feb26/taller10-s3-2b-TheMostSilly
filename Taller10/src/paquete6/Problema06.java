/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizEntrada = new double[5][6];
        double[][] matrizSalida = new double[5][6];
        int multiplicador;
        System.out.println("Ingrese el número a multiplicar");
        multiplicador = entrada.nextInt();
        for (int fila = 0; fila < matrizEntrada.length; fila++) {
            for (int col = 0; col < matrizEntrada[fila].length; col++) {
                System.out.printf("Ingrese los valores a multiplicar en la posición %s %s\n", fila, col);
                matrizEntrada[fila][col] = entrada.nextDouble();
            }
        }
        for (int fila = 0; fila < matrizSalida.length; fila++) {
            for (int col = 0; col < matrizSalida[fila].length; col++) {
                matrizSalida[fila][col] = matrizEntrada[fila][col] * multiplicador;

            }

        }
        System.out.println("Los valores ingresados son:");
        for (int fila = 0; fila < matrizEntrada.length; fila++) {
            for (int col = 0; col < matrizEntrada.length; col++) {
                System.out.printf("%s\t", matrizEntrada[fila][col]);
            }
            System.out.println("");
        }
        System.out.println("Los valores resultantes son:");
        for (int fila = 0; fila < matrizSalida.length; fila++) {
            for (int col = 0; col < matrizSalida.length; col++) {
                System.out.printf("%s\t", matrizSalida[fila][col]);

            }
            System.out.println("");
        }
    }
}
