import java.util.Scanner;

public class exer17 {
    // ANULADA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("Quantidade de dependentes: ");
        int dependentes = scanner.nextInt();

        double desconto = 0.02 * dependentes * rendaAnual;
        double rendaLiquida = rendaAnual - desconto;

        double imposto = 0.0;
        double taxa = 0.0;

        if (rendaLiquida <= 2000.00) {
            imposto = 0.0;
        } else if (rendaLiquida <= 5000.00) {
            taxa = 0.05;
            imposto = rendaLiquida * taxa;
        } else if (rendaLiquida <= 10000.00) {
            taxa = 0.10;
            imposto = rendaLiquida * taxa;
        } else {
            taxa = 0.15;
            imposto = rendaLiquida * taxa;
        }

        if (imposto == 0.0) {
            System.out.println("Isento de imposto.");
        } else {
            System.out.printf("O imposto é de %.0f%%: R$ %.2f\n", taxa * 100, imposto);
        }

        scanner.close();
    }
     
}
