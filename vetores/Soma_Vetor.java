package V2_11;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        int tamanho = 10;
        int i;
        int j;
        int soma;

        System.out.println("Digite os 10 elementos do vetor A:");
        for (i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        for (i = 0; i < tamanho; i++) {
            soma = 0;
            for (j = i; j < tamanho; j++) {
                soma += A[j];
            }
            B[i] = soma;
        }

        System.out.println("\nVetor B (somatório dos elementos de A):");
        for (i = 0; i < tamanho; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
        
        ler.close();
    }
}
