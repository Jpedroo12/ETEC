package algoritmos;
import java.util.Scanner;
public class imc {
	public static void main (String args[]) {
		Scanner ler= new Scanner(System.in);
		float altU,pesoU,imc;
		System.out.println("digite a sua altura em metros com virgula");
		altU=ler.nextFloat();
		System.out.println("digite o seu peso");
		pesoU=ler.nextFloat();
		imc=pesoU/(altU*altU);
		if (imc<18.5) {
		System.out.println("voce está com excesso de magreza, seu imc é "+imc+" ");
		} else if (imc <25) {
			System.out.println("voce está com o peso normal, seu imc é "+imc+" ");
		} else if (imc <30) {
			System.out.println("voce está com excesso de peso, seu imc é "+imc+" ");
	    } else if (imc <35) {
	    	System.out.println("voce está com o grau de obesidade I, seu imc é " +imc+ " ");	    	
	    } else if (imc <40) {
		    System.out.println("voce está com o grau de obesidade II, seu imc é "+imc+" ");
        } else if (imc >40) {
     	    System.out.println("voce está com o grau de obesidade III, seu imc é "+imc+" ");
        }
		ler.close();

	}
	}
	
