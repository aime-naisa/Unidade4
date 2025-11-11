import java.util.Scanner;

public class exer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Massa: ");
        double massa = scanner.nextDouble();

        double imc = massa / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.println(classificacao);

        scanner.close();
    }
}
