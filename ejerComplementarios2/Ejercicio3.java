package ejerComplementarios2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> naipe = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            naipe.add("Carta " + (i + 1));
        }

        System.out.println("Numeracion Ordenada");
        for (String card : naipe) {
            System.out.println(card);
        }

        Collections.reverse(naipe);
        System.out.println("Orden invertido");
        for (String card : naipe) {
            System.out.println(card);
        }

        Collections.shuffle(naipe);
        System.out.println("Sufle");
        for (String card : naipe) {
            System.out.println(card);
        }
    }
}
