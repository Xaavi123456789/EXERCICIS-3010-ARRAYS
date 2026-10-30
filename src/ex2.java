
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 3;

        System.out.print("Introduce el numero de columnas: ");
        int m = input.nextInt();

        int[][] matriz = new int[n][m];
        int[][] resultados = new int[3][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce un numero: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {

            int suma = 0;
            int maximo = matriz[0][j];
            int minimo = matriz[0][j];

            for (int i = 0; i < n; i++) {

                suma += matriz[i][j];

                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }

                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }

            resultados[0][j] = suma;
            resultados[1][j] = maximo;
            resultados[2][j] = minimo;
        }

        System.out.println("\nMATRIZ COMPLETA:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSUMA DE CADA COLUMNA:");

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + (j + 1) + ": " + resultados[0][j]);
        }

        System.out.println("\nNUMERO MAS ALTO:");

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + (j + 1) + ": " + resultados[1][j]);
        }

        System.out.println("\nNUMERO MAS BAJO:");

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + (j + 1) + ": " + resultados[2][j]);
        }

    }
}
