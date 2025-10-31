package org.example;

import java.util.Random;
import java.util.Scanner;

public class SumaDescentente {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int num_ale = aleatorio.nextInt(500,100000)+1;
        String num_ale_string = Integer.toString(num_ale);
        String num_des ="";
        String frase="";
        int conver = 0;
        int total = 0;
        System.out.println("Suma descendente del numero generado: " + num_ale);
        int num_tamanyo = num_ale_string.length();
        for (int i = 0; i<=num_tamanyo-1;i++){
            num_des = num_ale_string.substring(i);
            if (i==num_tamanyo-1){
                frase += num_des;

            }else {
                frase += num_des + " + ";
            }
            conver = Integer.parseInt(num_des);
            total = total+conver;
        }
        System.out.println(frase + " = " + total);
    }
}
