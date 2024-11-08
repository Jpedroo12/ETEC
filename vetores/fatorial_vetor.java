package V2_11;

import java.util.Scanner;
	
public class fatorial_vetor{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int indice, numero,resu, i;
        int[] A = new int[15];
        int[] B = new int[15];
        int tamanho = 15;

        for (indice = 0; indice < tamanho; indice++) {
            System.out.print("Digite o elemento " + (indice + 1) + " do vetor A: ");
            A[indice] = ler.nextInt();
        }

        for (indice = 0; indice < tamanho; indice++) {
             numero = A[indice];
             resu = 1;
             i = 1;

            while (numero >= i) {
                resu = resu * i;
                i++;
            }

            B[indice] = resu;
        }

        System.out.println("Vetor B (fatorial dos elementos de A):");
        for (indice = 0; indice < tamanho; indice++) {
            System.out.println("B[" + indice + "] = " + B[indice]);
        }
        
        ler.close();
    }
}
