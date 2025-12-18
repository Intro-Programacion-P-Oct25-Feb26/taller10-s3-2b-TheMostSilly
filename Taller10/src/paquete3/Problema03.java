/*
 
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        int[] zonas = new int[4];
        String reporte = "";
        for (int fila = 0; fila < sensores.length; fila++) {
            int suma = 0;
            for (int col = 0; col < sensores[fila].length; col++) {
                if (sensores[fila][col] == true) {
                    suma += 1;
                }
            }
            zonas[fila] = suma;

        }
        for (int fila = 0; fila < zonas.length; fila++) {
            if (zonas[fila] != 0) {
                reporte = String.format("%sLa zona %s tiene %s fallas\n", reporte, fila + 1, zonas[fila]);
            } else {
                reporte = String.format("%sLa zona %s no tiene fallas\n",reporte, fila + 1);
            }
        }
        System.out.println(reporte);
    }

}
