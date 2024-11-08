package V2_11;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        boolean palindromo;
        
        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

        palindromo = true;
        for (int i = 0; i < 5; i++) {
            if (A[i] != A[9 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }

        ler.close();
    }
}

