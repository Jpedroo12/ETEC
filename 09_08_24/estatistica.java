package lista;
import java.util.*;
public class estatistica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qta, escolha;
        double pormb, porb, porr, pori, qmb, qb, qr, qi;
        System.out.print("Informe a quantidade total de alunos: ");
        qta = ler.nextInt();       
        System.out.print("Informe a quantidade de alunos com menção MB: ");
        qmb = ler.nextInt();    
        System.out.print("Informe a quantidade de alunos com menção B: ");
        qb = ler.nextInt();        
        System.out.print("Informe a quantidade de alunos com menção R: ");
        qr = ler.nextInt();        
        System.out.print("Informe a quantidade de alunos com menção I: ");
        qi = ler.nextInt();       
        System.out.println("Escolha a menção para calcular a porcentagem:");
        System.out.println("1 - MB");
        System.out.println("2 - B");
        System.out.println("3 - R");
        System.out.println("4 - I"); 
        escolha = ler.nextInt();  
        
        switch (escolha) {
            case 1:
                pormb = (qmb / qta) * 100;
                System.out.println("Porcentagem de alunos com menção MB: " +pormb+" %");
                break;
            case 2:
                porb = (qb / qta) * 100;
                System.out.println("Porcentagem de alunos com menção B: " +porb+" %");
                
                break;
            case 3:
                porr = (qr / qta) * 100;
                System.out.println("Porcentagem de alunos com menção R	: " +porr+" %");
                break;
            case 4:
                pori = (qi / qta) * 100;
                System.out.println("Porcentagem de alunos com menção I: " +pori+" %");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
        ler.close();
    }
}