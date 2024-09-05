import java.util.Scanner;
public class Algoritmo_11{
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double preco, ipva;
		System.out.println("Digite o valor original do veículo.");
		preco=ler.nextDouble();
		ipva= preco* 0.04;
        System.out.println("O preço do ipva é:" + ipva);
        
	}
}
