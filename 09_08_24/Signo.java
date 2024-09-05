package lista;
import java.util.*;
public class Signo {
	public static void main(String[] args) {
	    Scanner ler= new Scanner(System.in);
	    int dia  , mes;
	    System.out.println("digite o mês que você nasceu");
	    mes= ler.nextInt ();
	    System.out.println("digite o dia que você nasceu");
	    dia= ler.nextInt();
	    switch(mes){
		case 1:
			if (dia <21) {
		    	System.out.println("Seu signo é cápricornio");
		    }
			else {
				System.out.println("Seu signo é aquário");
			}
			break;
		case 2:	
			if (dia <22) {
		    	System.out.println("Seu signo é aquário");
		    }
			else  {
		    	System.out.println("Seu signo é peixes");
		    }
			break;
		case 3:	
			if (dia <20) {
		    	System.out.println("Seu signo é peixes");
		    }
			else  {
		    	System.out.println("Seu signo é áries");
		    }
			break;
		case 4:	
			if (dia <21) {
		    	System.out.println("Seu signo é aries");
		    }
			else  {
		    	System.out.println("Seu signo é touro");
		    }
			break;
		case 5:	
			if (dia <21) {
		    	System.out.println("Seu signo é touro");
		    }
			else  {
		    	System.out.println("Seu signo é gêmeos");
		    }
			break;
		case 6:	
			if (dia <21) {
		    	System.out.println("Seu signo é gêmeos");
		    }
			else  {
		    	System.out.println("Seu signo é câncer");
		    }
			break;
		case 7:	
			if (dia <23) {
		    	System.out.println("Seu signo é câncer");
		    }
			else  {
		    	System.out.println("Seu signo é leão");
		    }
			break;
		case 8:	
			if (dia <24) {
		    	System.out.println("Seu signo é leão");
		    }
			else  {
		    	System.out.println("Seu signo é virgem");
		    }
			break;
		case 9:	
			if (dia <24) {
		    	System.out.println("Seu signo é virgem");
		    }
			else  {
		    	System.out.println("Seu signo é libra");
		    }
			break;
		case 10:	
			if (dia <24) {
		    	System.out.println("Seu signo é libra");
		    }
			else  {
		    	System.out.println("Seu signo é escorpião");
		    }
			break;
		case 11:	
			if (dia <24) {
		    	System.out.println("Seu signo é escorpião");
		    }
			else  {
		    	System.out.println("Seu signo é sagitário");
		    }
			break;
		case 12:	
			if (dia <22) {
		    	System.out.println("Seu signo é sagitário");
		    }
			else  {  
		    System.out.println("Seu signo é capricórnio");
		    }
			break;	
		 default:
			System.out.println("mês inválido");
	}
	    ler.close ();
	}
}
