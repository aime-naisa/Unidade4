import java.util.Scanner;

public class exer26 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Opção: ");
        char opcao = scanner.next().toUpperCase().charAt(0);

        double area = 0;

        switch (opcao) {
            case 'T':
                System.out.print("Base: ");
                double baseT = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaT = scanner.nextDouble();
                area = (baseT * alturaT) / 2;
                break;

            case 'Q':
                System.out.print("Lado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                break;

            case 'R':
                System.out.print("Base: ");
                double baseR = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaR = scanner.nextDouble();
                area = baseR * alturaR;
                break;

            case 'C':
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                area = Math.PI * raio * raio;
                break;

            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.printf("%.2f\n", area);

        scanner.close();
    }
}
