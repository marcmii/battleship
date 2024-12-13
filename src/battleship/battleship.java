package battleship;
import java.util.Random;
import java.util.Scanner;
public class battleship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int filaVaixell = random.nextInt(4);
        int columnaVaixell = random.nextInt(4);
        int intents = 0;
        boolean vaixellEnfonsat = false;

        System.out.println("Bienvenido al Battleship Game!");
        
        while (!vaixellEnfonsat) {
            System.out.println("  A B C D");
            for (int i = 0; i < 4; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 4; j++) {
                    if (i == filaVaixell && j == columnaVaixell) {
                        System.out.print("* "); 
                    } else {
                        System.out.print("* "); 
                    }
                }
                System.out.println();
            }
            System.out.println("");
            System.out.print("Introduce una coordenada (ex: B1, A4): ");
            String entrada = in.nextLine().toUpperCase();
            System.out.println("");
            intents++;
            
            char fila = entrada.charAt(0);
            char columna = entrada.charAt(1);
            int filaIndex = fila - 'A';
            int columnaIndex = columna - '1';

            if (filaIndex >= 0 && filaIndex < 4 && columnaIndex >= 0 && columnaIndex < 4) {
                if (filaIndex == filaVaixell && columnaIndex == columnaVaixell) {
                    System.out.println(entrada + " = tocado y hundido!!  " + intents + " jugadas.");
                    vaixellEnfonsat = true;
                } else {
                	System.out.println("");
                    System.out.println(entrada + " = AGUA");
                }
            } else {
                System.out.println("Coordenada no válida. Prueba otra.");
            }
        }
        System.out.println("La posicion del barco era: " + (char)('A' + filaVaixell) + (columnaVaixell + 1));
        in.close();
    }
}
