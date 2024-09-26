package a30_08_24;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base, expoente, resultado= 1, i= 1;
        
        System.out.print("Digite a base: ");
        base = ler.nextInt();
        
        System.out.print("Digite o expoente: ");
        expoente = ler.nextInt();

        while (i <= expoente) {
            resultado = base * resultado;
            i++;
        }

        System.out.println(base + " elevado a " + expoente + " é " + resultado);
        
        ler.close();
    }
}