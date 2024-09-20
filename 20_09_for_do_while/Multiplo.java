
public class Multiplo {
	    public static void main(String[] args){
	        int i = 1 ;
          double resto;
	        for (i=1; i<=100;i++) {
	            resto = i%10;
	              if (resto==0) {
	                System.out.println (i+ " é multiplo de 10");
	              }
	              else {
	                System.out.println(i);
	              }
	        } while (i<=100);
	    }
}

