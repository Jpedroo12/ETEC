package algoritmos;
import java.util.Scanner;
public class carro {
	public static void main(String args[]) {
		Scanner ler= new Scanner(System.in);
		double dp,ctcl,gm;
		System.out.println("Digita a distância percorrida em quilometros:");
		dp=ler.nextDouble();
		System.out.println("Digita a capacidade do tanque de combustível em litros:");
        ctcl=ler.nextDouble();
        gm=dp/ctcl;
		if(gm<10) {
		        System.out.println("não é econômico:" + gm);
	}
		else {
			System.out.println("é econômico:" + gm);
			
		}
		ler.close();
		}
}	