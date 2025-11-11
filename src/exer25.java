import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Valor 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println(valor1 + valor2);
        } else if (opcao == 2) {
            System.out.println(valor1 - valor2);
        } else if (opcao == 3) {
            System.out.println(valor1 * valor2);
        } else if (opcao == 4) {
            if (valor2 == 0) {
                System.out.println("Erro: Divisão por zero.");
            } else {
                System.out.println(valor1 / valor2);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
