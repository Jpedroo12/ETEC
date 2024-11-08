package V2_11;
import java.util.*;

public class Tabuada_vetor {	
	public static void main(String[] args) {
		Scanner ler  = new Scanner (System.in);
	    final int TAM=5;
	    int i, a[], multi;
	    a = new int [TAM];
	    
	    
	    //lendo o valor dos 5 elementos
	    for (i=0; i<TAM; i++) {
	        System.out.println("Digite o "+(i+1)+"º valor de A:");
	        a[i] = ler.nextInt();
	    }
	        
	        
	        for ( i = 0; i < TAM; i++) {
	            System.out.println("Tabuada do " + a[i] + ":");
	           
	        }
	    }
		
	}


