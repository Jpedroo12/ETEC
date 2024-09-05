package javas;
import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anoNasc, anoAt, idade;
		System.out.println("digite seu ano de nascimento");
		anoNasc=ler.nextInt();
		System.out.println("digite o ano atual");
		anoAt=ler.nextInt();
		idade=anoAt-anoNasc;
		if (idade<10) {
		System.out.println("voce tem: " +idade+" anos e � crian�a");
		} else if (idade <18) {
			System.out.println("voc�  tem: " +idade+" anos e � adolescente");
		} else if (idade <60) {
			System.out.println("voc�  tem: " +idade+" anos e � adulto");
		}
		else {
			System.out.println("voc�  tem: " +idade+" anos e � idoso");
		}
		ler.close();
	 }
	}

 

