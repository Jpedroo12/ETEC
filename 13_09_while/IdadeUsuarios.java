package algoritimo_13_09;
import java.util.Scanner;

public class IdadeUsuarios {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int anoAtual, anoNascimento, maisVelho, maisNovo;
        int[] idades = new int[10];

        System.out.print("Digite o ano atual: ");
        anoAtual = ler.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o ano de nascimento do usuário " + (i + 1) + ": ");
            anoNascimento = ler.nextInt();
            idades[i] = anoAtual - anoNascimento; 
        }

        
        maisVelho = idades[0];
        maisNovo = idades[0];

        for (int idade : idades) {
            if (idade > maisVelho) {
                maisVelho = idade;
            }
            if (idade < maisNovo) {
                maisNovo = idade;
            }
        }

       
        System.out.println("Idades dos usuários:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Usuário " + (i + 1) + ": " + idades[i] + " anos");
        }
        System.out.println("Idade do mais velho: " + maisVelho + " anos");
        System.out.println("Idade do mais novo: " + maisNovo + " anos");

        ler.close();
    }
}
