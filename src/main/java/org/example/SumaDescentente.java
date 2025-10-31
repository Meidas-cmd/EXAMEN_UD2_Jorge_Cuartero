package org.example;

import java.util.Scanner;

public class SumaDescentente {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int num_bronca = 0;
        int total_bronca = 0;
        boolean estado = false;
        String seguir = "";
        for (int i=1 ; estado != true ; i++) {
             num_bronca = 50;
            System.out.println("**Bienvenido a la app de broncas***");
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("Datos de la bronca " + i +" : ");
            System.out.println("Selecciona la persona encargada de la bronca: ");
            System.out.println("[-]. Profes");
            System.out.println("[-]. Padre");
            System.out.println("[-]. Madre");
            System.out.println("[-]. Monitor (Extraescolares)");
            System.out.println("[-]. Suegra");
            System.out.println("[-]. Otros");
            System.out.println("------------------------------------------");
            System.out.println("Elige una opcion:");
            String op = entrada.next();
            switch (op.toLowerCase()) {
                case "profes":
                    num_bronca = num_bronca * 10;
                    total_bronca = total_bronca+num_bronca;
                    break;
                case "padre":
                    num_bronca = num_bronca * 100;
                    total_bronca = total_bronca+num_bronca;
                    break;
                case "madre":
                    num_bronca = num_bronca * 100;
                    total_bronca = total_bronca+num_bronca;

                    break;
                case "monitor":
                    num_bronca = num_bronca * 5;
                    total_bronca = total_bronca+num_bronca;
                    break;
                case "suegra":
                    num_bronca = num_bronca * 1000;
                    total_bronca = total_bronca+num_bronca;
                    break;
                case "otros":
                    total_bronca = total_bronca+num_bronca;
                    break;
                default:
                    System.out.println("Opcion no valida..");
                    System.out.println("Saliendo...");
                    return;


            }

            System.out.println("Puntuacion de la bronca " + num_bronca);
            System.out.println("¿Quieres añadir otra bronca? (S/N)");
            seguir = entrada.next();
            if (seguir.toLowerCase().equals("n")){
                estado = true;
            }


        }
        if (total_bronca != 0){
            System.out.println("Resultados semanales:");
            System.out.println("Total de la bronca = " + total_bronca);
            if (total_bronca >= 100000){
                System.out.println("Esta semana sin paga");
            }else if (total_bronca >= 50000){
                System.out.println("Esta semana media paga");
            } else {
                System.out.println("Esta semana te libras");
            }

        }
    }

}
