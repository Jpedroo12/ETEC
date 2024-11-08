package V2_11;
import java.util.Scanner;

public class diferenca{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[5]; 
       
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

       
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = ler.nextInt();
        }

        
        for (int i = 0; i < 5; i++) { 
            C[i] = A[i] - B[i]; 
        }

        
        System.out.println("Os elementos do vetor C (A[i] - B[i]) são:");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
