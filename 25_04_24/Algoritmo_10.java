import java.util.Scanner;
public class Algoritmo_10{
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double metros, quilômetros ;
		System.out.println("Digite o número de metros");
		metros=ler.nextDouble();
		quilômetros=metros/1000;
        System.out.println("O número de metros em quilômetros é:" + quilômetros);
        
	}
}
