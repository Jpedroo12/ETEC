package lista;
import java.util.*;
public class cantina {
  public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int cod;
	System.out.println("digite o código do produto que você queira comprar");
	cod=ler.nextInt();
	 switch (cod) {
	 case 1:
		 System.out.println("O produto que você escolheu é o Cachorro Quente");
		 System.out.println("O valor do Cachorro Quente é: R$ 8,00");
	 break;
	 case 2:
		 System.out.println("O produto que você escolheu é o Cheeseburger");
		 System.out.println("O valor do Cheeseburger é: R$ 12,00 ");
	 break;
	 case 3:
		 System.out.println("O produto que você escolheu é o X-Salada");
		 System.out.println("O valor do X-Salada é: R$ 15,00 ");
	 break;
	 case 4:
		 System.out.println("O produto que você escolheu é o Misto Quente");
		 System.out.println("O valor do Misto Quente é: R$ 11,00");
	 break;
	 case 5:
		 System.out.println("O produto que você escolheu é o Pão na chapa");
		 System.out.println("O valor do Pão na chapa quente é: R$ R$ 6,00");
	 break;
     default:
         System.out.println("Não existe um produto com esse código");
	 }
	ler.close();
}
}
