package a30_08_24;

import java.util.*;

public class tabuada {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int i=1,numero = 1,resul;
		
		System.out.println("Qual tabuada deseja saber?");
		numero= ler.nextInt();
		
		while(i<=10) {
			resul = numero*i;
			System.out.println(numero+"x"+i+"=" +resul);
			i++;
		}
		
		ler.close();
	}
}

