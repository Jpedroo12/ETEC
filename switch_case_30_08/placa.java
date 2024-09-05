package lista;
import java.util.*;
public class placa {
	public static void main(String[] args) {
	    Scanner ler= new Scanner(System.in);
	    int p;
	System.out.println("escreva o ultimo numero da sua placa");
	p=ler.nextInt();
	switch (p){
	case 1:
	case 2:	
		System.out.println("n�o roda de segunda");
	    break;
	case 3:
	case 4:
        System.out.println("n�o roda de ter�a");
        break;
	case 5:
	case 6:
		System.out.println("n�o roda de quarta");
		   break;
			case 7:
			case 8:
				System.out.println("n�o roda de quinta");   
				   break;
			case 0:
			case 9:
				System.out.println("n�o roda de sexta");   	
	}
	ler.close ();
	}
}
