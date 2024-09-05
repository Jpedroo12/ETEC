
import java.util.*;

public class Categoria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id;
        System.out.println("Digite sua idade");
        id = ler.nextInt();
        switch(id){
            case 6:
            System.out.println("dente de leite");
            break;
            case 7:
            System.out.println("júnior");
            break;
            case 8:
            System.out.println("junior max");
            break;
            case 9:
            System.out.println("junior master");
            break;
            case 10:
            System.out.println("master");
            break;
            default:
            System.out.println("A escola não admite alunos de outras idades.");
            
        }
        
        
        
    }
    
}