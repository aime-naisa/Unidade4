import java.util.Scanner;

public class exer24 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();
        int opcao = scanner.nextInt();

        int maior, meio, menor;

        if (v1 >= v2 && v1 >= v3) {
            maior = v1;
            if (v2 >= v3) {
                meio = v2;
                menor = v3;
            } else {
                meio = v3;
                menor = v2;
            }
        } else if (v2 >= v1 && v2 >= v3) {
            maior = v2;
            if (v1 >= v3) {
                meio = v1;
                menor = v3;
            } else {
                meio = v3;
                menor = v1;
            }
        } else {
            maior = v3;
            if (v1 >= v2) {
                meio = v1;
                menor = v2;
            } else {
                meio = v2;
                menor = v1;
            }
        }

        if (opcao == 1) {
            System.out.println(menor + " " + meio + " " + maior);
        } else if (opcao == 2) {
            System.out.println(maior + " " + meio + " " + menor);
        } else if (opcao == 3) {
            System.out.println(menor + " " + maior + " " + meio);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
