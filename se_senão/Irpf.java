package javas;
import java.util.Scanner;
public class Irpf{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal, aliq, irpf;	
        System.out.print("Digite o salário do empregado: ");
        sal=ler.nextDouble();
        if (sal <= 1434.59) {
            aliq = 0;
            aliq = 0;
        } else if (sal <= 2150.00) {
            aliq = 7.5;
            irpf = 107.59;
        } else if (sal <= 2866.70) {
            aliq = 15.0;
            irpf = 268.84;
        } else if (sal <= 3582.00) {
            aliq = 22.5;
            irpf = 483.84;
        } else {
            aliq = 27.5;
            irpf = 662.94;
        }
        System.out.println("O desconto do IRPF é: ");
        ler.close();
    }
}