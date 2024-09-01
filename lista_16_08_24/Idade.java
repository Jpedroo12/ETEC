package lista;
import java.util.*;
public class Idade {
	public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int anoNasc, anoAt, idade, i=1;
			while (i<6) {
			System.out.println("digite seu ano de nascimento");
			anoNasc=ler.nextInt();
			System.out.println("digite o ano atual");
			anoAt=ler.nextInt();
			idade=anoAt-anoNasc;
			if (idade <18) {
			 System.out.println("você é menor de idade");
			}
			else {
				System.out.println("você é maior de idade");
			}
			i++;
			}
			ler.close();					
		 }		
		}

