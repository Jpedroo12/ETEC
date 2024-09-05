package javas;
import java.util.*;
public class bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta,raiz, raiz1, raiz2;
        System.out.print("Digite um primeiro valor: ");
        a = scanner.nextDouble();

        System.out.print("Digite um segundo valor: ");
        b = scanner.nextDouble();
        System.out.print("Digite um terceiro de valor: ");
        c = scanner.nextDouble();
        delta = (b*b)-4*a*c;
        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
        	raiz = -b / (2*a);
            System.out.println("Existe apenas uma raiz real para a equação: " + raiz);
        } else {
             raiz1 = (-b + Math.sqrt(delta)) / (2*a);
             raiz2 = (-b- Math.sqrt(delta)) / (2* a);
            System.out.println("Existem duas raízes reais para a equação:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        scanner.close();
    }
}
