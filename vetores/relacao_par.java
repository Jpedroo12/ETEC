package V2_11;
import java.util.Scanner;

public class relacao_par {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int par;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + A[i] + ": ");
            for (par = 0; par <= A[i]; par += 2) {
                System.out.print(par + " ");
            }
            System.out.println();
        }

        ler.close();
    }
}

