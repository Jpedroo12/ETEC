package javas;
import java.util.Scanner;
public class imc {
	public static void main (String args[]) {
		Scanner ler= new Scanner(System.in);
		double altura,peso,imc;
		System.out.println("digite a sua altura");
		altura=ler.nextDouble();
		System.out.println("digite o seu peso");
		peso=ler.nextDouble();
		imc=peso/(altura*altura);
		if (imc<18.5) {
		System.out.println("voce está com excesso de magreza, seu imc é "+imc+" ");
		} else if (imc <25) {
			System.out.println("voce está com o peso normal, seu imc é "+imc+" ");
		} else if (imc <30) {
			System.out.println("voce está com excesso de peso, seu imc é "+imc+" ");
		} else if (imc <35) {
		    System.out.println("voce tá no 1°grau de obesidade, seu imc é "+imc+" ");
		} else if (imc <40) {
		    System.out.println("voce tá no 2°grau de obesidade, seu imc é "+imc+" ");
		} else  {
		    System.out.println("voce tá no 3°grau de obesidade, seu imc é "+imc+" ");
		}
		ler.close();
	 }
	}
	
