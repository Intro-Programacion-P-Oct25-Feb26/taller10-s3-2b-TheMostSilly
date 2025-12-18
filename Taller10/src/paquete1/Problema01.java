/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean[][] asistencia = {{true, true, false, true, true}, {true, false,
            false, true, false}, {true, true, true, true, true}, {false, true, true, false,
            true}};
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] asist = new int[5];
        int suma;
        String reporte = "";
        for (int fila = 0; fila < asistencia.length; fila++) {
            suma = 0;
            for (int col = 0; col < asistencia[fila].length; col++) {
                if (asistencia[fila][col] == true) {
                    suma = suma + 1;
                }
            }
            asist[fila] = suma;
        }
        for (int fila = 0; fila < asistencia.length; fila++) {
            if (asist[fila] != 5) {
                reporte = String.format("%sEstudiante %s asistió %s días"
                        + "\n", reporte, estudiantes[fila], asist[fila]);

            } else {
                reporte = String.format("%sEl estudiante %s tiene asistencia completa"
                        + " de 5 días\n", reporte, estudiantes[fila]);
            }
        }
        System.out.println(reporte);

    }

}
