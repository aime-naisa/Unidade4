import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Insira outro valor: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("\nO numero " + valor1 + " é maior que o número " + valor2);
        } else {
            System.out.println("\nO numero " + valor1 + " é maior que o número " + valor2);
        }

        sc.close();
    }
}