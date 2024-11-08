import java.util.*; 
public class Algoritmo15 {
	public static void main(String[] args) {
		
		Scanner ler  = new Scanner (System.in);	
		final int TAM=10;
		int i, a[], b[];
		a = new int [TAM];
	    b = new int [TAM];
	    Integer[] c = new Integer[TAM];
		for (i=0; i<10; i++) {
	        System.out.println("Digite o "+(i+1)+"º valor de A:");
	        a[i] = ler.nextInt();
	}
		for (i=0; i<10; i++) {			
				b[i] = a[i];		
	}
		 Arrays.sort(b);
			for (i=0; i<10; i++) {			
				c[i] = a[i];		
	}
			Arrays.sort(c, Collections.reverseOrder());
			System.out.print("Vetor B em ordem decrescente:");
		for (i=0; i<10; i++) {
		    if (i < 9) {
		        System.out.print(b[i]+",");
		    } else {
		        System.out.print(b[i]); 
		    }
	}	
		System.out.print("\nVetor C em ordem decrescente:");
		for (i = 0; i < 10; i++) {
			  if (i < 9) {
			        System.out.print(c[i]+",");
			    } else {
			        System.out.print(c[i]); 
			    }	    	
}
		ler.close();
	}
	}
