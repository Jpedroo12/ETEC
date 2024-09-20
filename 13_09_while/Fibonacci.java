package algoritimo_13_09;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0, b = 1, fib = 0, i = 2, n;
        
        System.out.print("Digite o valor de n para calcular o enésimo termo da sequência de Fibonacci: ");
        n = ler.nextInt();
                
        if (n <= 1) {
            fib = n;
        } else {
            while (i <= n) {
                fib = a + b;
                a = b;
                b = fib;
                i++;
            }
        }
        
        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + fib);
        ler.close();
    }
}
