import java.util.Scanner;
public class Algoritmo_05 {
	public static void main(String args[]){
	Scanner ler= new Scanner(System.in);
	int a, b, c;
	
	System.out.println("Digite o primeiro valor inteiro");
	a=ler.nextInt();
	System.out.println("Digite o segundo valor inteiro");
	b=ler.nextInt();
	c = a;
	a = b;
	b = c;
	System.out.println("Os valores invertidos são: " + a + "," + b );
	
	}
}
