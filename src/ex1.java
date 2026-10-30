
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, m;

        System.out.print("Introduce el numero de filas: ");
        n = input.nextInt();

        System.out.print("Introduce el numero de columnas: ");
        m = input.nextInt();

        int[][] matriz = new int[n][m];
        int[] vector = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce un numero: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            int suma = 0;

            for (int i = 0; i < n; i++) {
                suma = suma + matriz[i][j];
            }

            vector[j] = suma;
        }

        System.out.println("Suma de cada columna:");

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + (j + 1) + ": " + vector[j]);
        }

    }
}
