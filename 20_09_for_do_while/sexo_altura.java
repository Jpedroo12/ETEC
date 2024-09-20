
import java.util.Scanner;
public class sexo_altura{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char sexo;
        double altura;
        double pesoIdeal;
        int continuar= 0;

        do {
            System.out.print("Digite o sexo (m para masculino, f para feminino): ");
            sexo = ler.next().toLowerCase().charAt(0);

            System.out.print("Digite a altura em centímetros: ");
            altura = ler.nextDouble();

            pesoIdeal = 0;

            if (sexo == 'm') {
                pesoIdeal = 52 + (0.75 * (altura - 152.4));
            } else if (sexo == 'f') {
                pesoIdeal = 52 + (0.67 * (altura - 152.4));
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
                continue;
            }

            System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);

            System.out.print("Deseja continuar a execução? (1 para SIM ou 2 para NÃO): ");
            continuar = ler.nextInt();

        } while (continuar == 1);

        ler.close();
    }
}
