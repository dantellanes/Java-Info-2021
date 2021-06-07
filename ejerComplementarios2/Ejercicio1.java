package ejerComplementarios2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean condicion=true;
        List<String> ciudades = new ArrayList<>();
       
        System.out.println("Ingresa tu ciudad favorita de argentina");
        ciudades.add(teclado.nextLine());
        do {
            System.out.print("¿Quiere agregar otra ciudad? [s/n]: ");
            switch (teclado.nextLine().charAt(0)) {
                case 's':
                    System.out.println("Ingresa tu ciudad favorita de argentina");
                    ciudades.add(teclado.nextLine());
                    break;
                case 'n':
                    condicion = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
                    break;
            }
        } while (condicion);
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#"+(i+1)+" -"+ciudades.get(i));
        }
        teclado.close();
    }
}
