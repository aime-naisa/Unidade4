import java.util.Scanner;

public class exer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();
        String titulo;

        if (opcao == 1) {
            titulo = "Bacharel em Ciência da Computação";
        } else if (opcao == 2) {
            titulo = "Licenciado em Computação";
        } else if (opcao == 3) {
            titulo = "Bacharel em Sistemas de Informação";
        } else {
            titulo = "Opção inválida";
        }

        System.out.println(titulo);

        scanner.close();
    }
}
