import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("\nO numero " + valor + " é par");
        } else {
            System.out.println("\nO valor " + valor + " é ímpar");
        }

        sc.close();
    }
}