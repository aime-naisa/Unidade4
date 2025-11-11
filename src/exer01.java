import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total de horas trabalhadas no mês: ");
        int horasMes = sc.nextInt();

        System.out.print("O valor pago por hora: ");
        double valorHora = sc.nextDouble();

        double salarioTotal;

        if (horasMes > 160) {
            int horasExtras = horasMes - 160;

            salarioTotal = (160 * valorHora) + (horasExtras * valorHora * 1.5);
        } else {
            salarioTotal = horasMes * valorHora;
        }

        System.out.printf("\nO salário é: R$%.2f%n", salarioTotal);;

        sc.close();
    }
}
