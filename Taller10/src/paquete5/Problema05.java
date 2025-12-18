/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String inicial;
        String reporte = "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                String nombre = estudiantes[fila][col];
                inicial = nombre.substring(0, 1);
                switch (inicial) {
                    case ("S"):
                    case ("P"):
                    case ("T"):
                        reporte += String.format("%s\n", nombre);
                        break;
                }
            }
        }
        System.out.println(reporte);
    }
}
