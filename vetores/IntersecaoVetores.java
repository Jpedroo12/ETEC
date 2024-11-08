package V2_11;
import java.util.Scanner;

public class IntersecaoVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int tamC = 0;
        boolean encontrado;
        int i, j, indiceC;

        System.out.println("Digite os elementos do vetor A:");
        for (i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (i = 0; i < 10; i++) {
            B[i] = ler.nextInt();
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    encontrado = false;
                    for (indiceC = 0; indiceC < tamC; indiceC++) {
                        if (C[indiceC] == A[i]) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        C[tamC] = A[i];
                        tamC++;
                    }
                    break;
                }
            }
        }

        System.out.println("Elementos da interseção (vetor C):");
        if (tamC > 0) {
            for (i = 0; i < tamC; i++) {
                System.out.print(C[i] + " ");
            }
        } else {
            System.out.println("Nenhum elemento na interseção.");
        }
    }
}
