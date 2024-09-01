package lista;
import  java.util.*;
public class Tabuada {
      public static void main(String[] args) {
	  Scanner ler=new Scanner (System.in);
	  int numero1,numero2,i=1;
	  System.out.println("digite um numero para ver sua tabuada até 10");
	  numero1= ler.nextInt();
	  while (i<11) {
		 numero2=i*numero1;
		 System.out.println(numero2);
		 i=i+1;
	  }
	  ler.close ();
}
}
