package V2_11;
import java.util.*;

public class media_vetores {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	 final int TAM=10;
	    int i, a[], soma[];
	    a = new int [TAM];
	    soma = new int [TAM];
	
	    
	    for (i=0; i<TAM; i++) {
	        System.out.println("Digite o "+(i+1)+"º valor");
	        a[i] = ler.nextInt();
	        }
	    
	    for (i=0; i<TAM; i++) {
	    	soma[i]= a[i] + a[i];
	        }
	    
		for (i=0; i<TAM; i++) { 
			if (i==TAM-1) {
			 System.out.print(soma[i]);
		 }else {
			 System.out.print(soma[i]+ ",");
		 }
		}
	    
	}
}
