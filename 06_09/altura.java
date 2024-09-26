package a30_08_24;

public class altura {
	public static void main(String[] args) {
		
     double alturaJoão = 134;
     double	alturaPedro = 145;
     int i = 0;
     
     while (alturaJoão<=alturaPedro) {
    	 alturaJoão= alturaJoão+2.5;
    	 alturaPedro= alturaPedro+2;
    	 i++;
     }
     
     System.out.println("Demorou " + i + " anos para João ultrapassar Pedro" );
     
  	 System.out.println("A altura de João é: "+alturaJoão);
  	 
	 System.out.println("A altura de Pedro é: "+alturaPedro);
	 
	}
}
