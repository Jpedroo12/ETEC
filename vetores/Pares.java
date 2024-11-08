import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
	Scanner bolo = new Scanner (System.in);
    final int TAM=20;
    int i=0, a[], b[], par=0,impar=19;
    a = new int [TAM];
    b = new int [TAM];
    
    for (i=0; i<20; i++) {
        System.out.println("Digite o "+(i+1)+"º valor de A:");
        a[i] = bolo.nextInt();
    }
    
    System.out.print("valores pares= [");
    
    for (i=0; i<20  ; i++) {
      
    	if (a[i]%2==0){
    	   b[par]=a[i];
    	   System.out.print(b[par] + " ");
    	   par++;
       }
       else {
    	 
       }
    
    }
	System.out.println("]");
    System.out.print("valores impares= [");
    for (i=0; i<20  ; i++) {
        
    	if (a[i]%2==0){
    	
       }
       else {
    	   b[impar]=a[i];
    	   System.out.print(b[impar] + " ");
    	   impar--;
       }
    
	 }
    System.out.print("]");
	}
	}
