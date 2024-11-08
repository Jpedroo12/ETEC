import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
		
	Scanner ler = new Scanner (System.in);
	
	 final int TAM=10;
	 int i=1, a[], j=1;
	 
	 a = new int [TAM];
	  for (i=0; i<TAM; i++) {
	        System.out.println("Digite o "+(i+1)+"º valor de A:");
	        a[i] = ler.nextInt();
	    }
	  
	  for (i=1; i<TAM; i++) {
	  System.out.println("\nNumero:" +a[i]);
	  System.out.print("Divisores de " +a[i]+ ": ");
	  for (j=1; j<=a[i];j++) {
	   if (a[i]%j==0){
		System.out.print(+j+" ");
	   }
	   
	   
	   }
	
	  }
	  ler.close();
	}
	}
	  

 