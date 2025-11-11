import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int homem1 = sc.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int homem2 = sc.nextInt();

        System.out.print("Digite a idade da primeira mulher: ");
        int mulher1 = sc.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int mulher2 = sc.nextInt();

        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);

        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        sc.close();
    }
}