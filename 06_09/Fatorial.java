package a30_08_24;

import java.util.*;

public class Fatorial {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	 int numero,resu=1,i=1;
	 
	 System.out.println("Digite um número inteiro");
	 numero=ler.nextInt();
	 
	 while (numero>=i){
		 resu=resu*i;
		 i++;
		 }	
	 
	 System.out.println("O fatorial de "+numero+ " é: "+resu);
	 
	 ler.close();
	}
}