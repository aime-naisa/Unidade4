import java.util.Scanner;

public class exer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double mediaExercicios = scanner.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
        String conceito;
        String situacao;

        if (media >= 9.0) {
            conceito = "A";
            situacao = "Aprovado";
        } else if (media >= 7.5) {
            conceito = "B";
            situacao = "Aprovado";
        } else if (media >= 6.0) {
            conceito = "C";
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            conceito = "D";
            situacao = "Reprovado";
        } else {
            conceito = "E";
            situacao = "Reprovado";
        }

        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %s. %s\n", media, conceito, situacao);

        scanner.close();
    }
}
