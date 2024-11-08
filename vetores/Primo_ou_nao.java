package V2_11;
import java.util.Scanner;

public class Primo_ou_nao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int b;
        int[] a = new int[10];
        boolean primo;

       //lendo o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            a[i] = ler.nextInt();
        }

        // calculos pra ver se é primo
        for (int i = 0; i < 10; i++) {
             primo = true;

            if (a[i] <= 1) {
                primo = false;
            } else {
                for ( b = 2; b < a[i]; b++) {
                    if (a[i] % b == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("O elemento " + a[i] + " é primo.");
            } else {
                System.out.println("O elemento " + a[i] + " não é primo.");
            }
        }

        ler.close();
    }
}



