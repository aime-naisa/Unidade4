import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0)
        {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são mútiplos");
        }
       
        sc.close();
    }
}