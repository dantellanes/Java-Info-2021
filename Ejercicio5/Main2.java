package Ejercicio5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("\\Java-Info-2021\\Ejercicio5\\testFile.txt");
            ArrayList<String> contentList= new ArrayList<>();
            contentList.addAll(Files.readAllLines(path,StandardCharsets.UTF_8));
            List<Empleado> trabajadores = new ArrayList<>();
            
            String[] arrSplit ;
                        
            for (String cadena : contentList) {
                arrSplit= cadena.split(",");
                Empleado emp1= new Empleado(arrSplit[0],arrSplit[1],arrSplit[2],Float.parseFloat(arrSplit[3]));
                trabajadores.add(emp1);
            }
            for (int i = 0; i < trabajadores.size(); i++) {
            
                    System.out.println(trabajadores.get(i));
                    //System.out.println("tiene: "+ trabajadores.get(i).getEdad());
                 
            }
            System.out.println("");
            Collections.sort(trabajadores, (x,y) ->x.getApellido().compareToIgnoreCase(y.getApellido()));
            printList("Lista Ordenada ==>", trabajadores);

            Collections.sort(trabajadores, (x,y) -> y.getFechaNac().compareTo(x.getFechaNac()));
            printList("Lista Ordenada por edad ==>", trabajadores);
            System.out.println("El empelado mas Joven es :"+trabajadores.get(0));
            System.out.println("El empleado mas viejo es: "+trabajadores.get(trabajadores.size()-1));

            String busqueda = "m";
            System.out.println("");
            System.out.println("Letra Buscada "+ busqueda+ " Estos son los resultados:");
            for (Empleado e : trabajadores) {
                if (busqueda.equalsIgnoreCase(String.valueOf(e.getApellido().charAt(0)))) {
                    
                    System.out.println(e);
                }//else{System.out.println("no se encontro");}
                   
            }
            trabajadores.sort(Comparator.comparing(Empleado::getSueldo));
            printList("Lista Ordenada por sueldo==>", trabajadores);
            System.out.println("El sueldo mas chico es :"+trabajadores.get(0));
            System.out.println("El sueldo mas alto es: "+trabajadores.get(trabajadores.size()-1));
            
            
        }catch (IOException e){
            e.printStackTrace();
        } 
        
    } 
    private static void printList(String title, List list) {
        System.out.println(title);
        list.forEach(x -> System.out.println("\t" + x.toString()));
        System.out.println("");
    }
} 
