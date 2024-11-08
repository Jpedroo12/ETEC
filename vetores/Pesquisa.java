import java.util.Scanner;
public class Pesquisa {
      public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], pesquisa, i=0;
		final int TAM=10;
		a = new int[TAM];
		for (i=0; i<10; i++) {
		        System.out.println("Digite o "+(i+1)+"º valor de A:");
		        a[i] = ler.nextInt();
		}
		
		for (i=0; i<10; i++) {
			System.out.println("Digite o valor que você quer pesquisar");
			pesquisa = ler.nextInt();
			
			for (i=0;i<10; i++) {
				if ( a[i]==pesquisa) {
					System.out.println(a[i]+" está no vetor "+(i+1));
				}
				else {
					System.out.println(pesquisa+" não está no vetor "+(i+1));
				}
			}
	}
		
	}
}
