
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] notas = new int[20][6];

        int mejor = 0;
        int peor = 10;

        for (int i = 0; i < 20; i++) {
            System.out.println("Alumno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce una nota: ");
                notas[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 20; i++) {

            int suma = 0;
            int max = notas[i][0];
            int min = notas[i][0];

            for (int j = 0; j < 3; j++) {

                suma = suma + notas[i][j];

                if (notas[i][j] > max) {
                    max = notas[i][j];
                }

                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
            }

            notas[i][3] = suma / 3;
            notas[i][4] = max;
            notas[i][5] = min;

            if (max > mejor) {
                mejor = max;
            }

            if (min < peor) {
                peor = min;
            }
        }

        System.out.println("\nMATRIZ COMPLETA:");

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Mejor nota del curso: " + mejor);
        System.out.println("Peor nota del curso: " + peor);

    }
}
