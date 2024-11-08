package V2_11;
import java.util.Scanner;

public class vetor_potencia {
    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        int[] A;
        int i, multi;
        A = new int[11];

        for (i = 0; i < 11; i++) {
            A[i] = 1;
            for (multi = 0; multi < i; multi++) {
                A[i] *= 2;
            }
        }

        for (i = 0; i < 11; i++) {
            System.out.println("Elemento na posição " + i + ": " + A[i]);
        }

        ler.close();
    }
}



