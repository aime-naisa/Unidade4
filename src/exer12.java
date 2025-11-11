import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = sc.nextDouble();        

        if (lado1 < lado2 + lado3 && 
            lado2 < lado1 + lado3 &&
            lado3 < lado1 + lado2) 
            {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Equilátero");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Isósceles");
                } else {
                    System.out.println("Escaleno");
                }
        } else {
            System.out.println("Não forma um triângulo!");
        }

        sc.close();
    }
}