package tpa;
import java.util.*;
public class camp {
	public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    int anoNasc  , idade;
    System.out.println("Digite o ano de seu nascimento");
    anoNasc = ler.nextInt();
    idade = 2024-anoNasc;
    if (idade<=6) {
    	System.out.println("Sua categoria é Dente de Leite");
    }
    else  if (idade<=10) {
    	System.out.println("Sua categoria é	Infantil I");
    }
    else  if (idade<=14) {
    	System.out.println("Sua categoria é Infantil II");
    }
    else  if (idade<=16) {
    	System.out.println("Sua categoria é Juvenil I");
    }
    else  if (idade<=17) {
    	System.out.println("Sua categoria é Juvenil II");
    }
    else  {
    	System.out.println("Sua idade passa de 17 anos, você não pode participar.");
    }
    
}
	
}
