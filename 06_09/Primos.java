package a30_08_24;

import java.util.*;

public class Primos{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, i = 1, numeroDivisor = 0;
        
        System.out.println("Digite um número:");
        numero = ler.nextInt();
        
        if (numero <= 1) {
            System.out.println("Número inválido.");
        }
        
        
        while (i <= numero) {
            if (numero % i == 0) {
                numeroDivisor++;
            }
            i++;
        }
        
      
        if (numeroDivisor == 2) {
            System.out.println("Número primo");
        } 
        else {
            System.out.println("não primo");
        }
        
        ler.close();
    }
}


