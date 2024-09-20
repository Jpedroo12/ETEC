package algoritimo_13_09;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim, soma, quantidade, numero;
        double mediaCalculada;

        System.out.println("Olá! Vamos calcular a média aritmética de números em um intervalo.");
        System.out.print("Por favor, informe o número inicial do intervalo: ");
        inicio = ler.nextInt();

        System.out.print("Agora, informe o número final do intervalo: ");
        fim = ler.nextInt();

        if (inicio > fim) {
            System.out.println("O intervalo informado é inválido. O número inicial deve ser menor ou igual ao número final.");
        } else {
            soma = 0;
            quantidade = 0;
            numero = inicio;

            while (numero <= fim) {
                soma += numero;
                quantidade++;
                numero++;
            }

            if (quantidade > 0) {
                mediaCalculada = (double) soma / quantidade;
                System.out.println("A média aritmética dos números entre " + inicio + " e " + fim + " é: " + mediaCalculada);
            } else {
                System.out.println("Não há números dentro do intervalo informado.");
            }
        }

        System.out.println("Obrigado por usar o programa. Até a próxima!");
        ler.close();
    }
}
