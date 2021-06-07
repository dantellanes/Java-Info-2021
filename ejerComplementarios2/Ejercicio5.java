package ejerComplementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horas = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
        List<Integer> valorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));
        List<Integer> pagos = new ArrayList<>();

        for (int i = 0; i < horas.size(); i++) {
            pagos.add((horas.get(i)*valorHora.get(i)));
        }
        int total = 0;
        for (Integer integer : pagos) {
            System.out.println("$"+integer);
            total=total+ integer;
        }
        System.out.println("el total es: $"+ total);

    }
}
