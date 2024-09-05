import java.util.Scanner;
public class Algoritmo_08
{
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		int valor1, valor2, valor3, quadrado1, quadrado2, quadrado3, resultado;
		System.out.println("Digite o primeiro valor");
		valor1=ler.nextInt() ;
		System.out.println("Digite o Segundo valor");
		valor2=ler.nextInt() ;
		System.out.println("Digite o Terceiro valor");
		valor3=ler.nextInt() ;
        quadrado1 = (valor1*valor1);
        quadrado2= (valor2*valor2);
        quadrado3 = (valor3*valor3);
        resultado= quadrado1+quadrado2+quadrado3;
        System.out.println("A soma dos quadrados dos numeros é : " + resultado);



		





	}
	
}

