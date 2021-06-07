package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        char[] cadena = entrada.toCharArray();
        for (int i = 0; i < cadena.length; i++){
            if (cadena[i] >= 'a' && cadena[i] <= 'z') {
                cadena[i] = (char)(cadena[i] - (int) 'a' + (int) 'A');
            }
            System.out.print(cadena[i]);
        }
        System.out.println();
        teclado.close();
    }
}
