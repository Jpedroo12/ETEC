package V2_11;

import java.util.Scanner;

public class FormacaoPart1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int i;

        System.out.println("Digite os 10 elementos do vetor A:");
        for (i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }

        System.out.println("Vetor A:");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }

        ler.close();
    }
}

