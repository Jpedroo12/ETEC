package algoritmos;
import java.util.Scanner;
public class triangulo_bah {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double A,B,C ;
        
        System.out.print("Digite o valor do lado A: ");
        A = ler.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        B = ler.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        C = ler.nextDouble();
            if (A == B && B == C) {
                System.out.println("O triângulo é Equilátero: Três lados iguais.");
            } else if (A != B && A != C && B != C) {
                System.out.println("O triângulo é Escaleno: Três lados diferentes.");
            } else {
                System.out.println("O triângulo é Isósceles: Dois lados iguais e um lado diferente.");
            }
    
        }
        

    }
