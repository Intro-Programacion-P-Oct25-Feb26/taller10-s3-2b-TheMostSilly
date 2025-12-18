/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] salida = new double[3][3];
        boolean idee = true;
        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int col = 0; col < matrizX[fila].length; col++) {
                System.out.printf("Ingrese los valores a multiplicar en la posición %s %s\n",
                        fila, col);
                matrizX[fila][col] = entrada.nextDouble();
            }
        }
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                matrizA[fila][col] = (matrizX[fila][col] + 1) * (matrizX[fila][col] + 1);

            }

        }
        for (int fila = 0; fila < salida.length; fila++) {
            for (int col = 0; col < salida[fila].length; col++) {
                double x = matrizX[fila][col];
                salida[fila][col] = x * x + 2 * x + 1;

            }
        }
        for (int fila = 0; fila < salida.length; fila++) {
            for (int col = 0; col < salida[fila].length; col++) {
                if (matrizA[fila][col] != salida[fila][col]) {
                    idee = false;
                }
            }
        }
        if (idee){
            System.out.println("La identidad algebraica se cumple");
        }else{
            System.out.println("La identidad no se cumple");
        }
    }
}
