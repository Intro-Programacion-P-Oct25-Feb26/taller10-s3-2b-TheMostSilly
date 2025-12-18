/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[3][2];
        boolean mayor = true;

        for (int fila = 0; fila < matrizA.length; fila++) {

            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.printf("Ingrese los valores de la matriz A en la"
                        + " posición %s %s\n", fila, col);
                matrizA[fila][col] = entrada.nextInt();
            }
        }

        for (int fila = 0; fila < matrizB.length; fila++) {

            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.printf("Ingrese los valores de la matriz B en la"
                        + " posición %s %s\n", fila, col);
                matrizB[fila][col] = entrada.nextInt();
            }

        }
        System.out.println("La matriz A tiene los valores");
        for (int fila = 0; fila < matrizA.length; fila++) {

            System.out.printf("%s\t%s\n", matrizA[fila][0], matrizA[fila][1]);

        }
        System.out.println("La matriz B tiene los valores");

        for (int fila = 0; fila < matrizB.length; fila++) {

            System.out.printf("%s\t%s\n", matrizB[fila][0], matrizB[fila][1]);

        }
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                if (matrizB[fila][col] > matrizA[fila][col]) {
                    mayor = false;
                }
            }
        }
        if (mayor) {
            System.out.println("La matriz A es mayor que la matriz B");
        }else{
            System.out.println("La matriz A no es mayor a la matriz B");
        }

    }

}
