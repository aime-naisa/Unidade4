import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso da carta em gramas: ");
        double peso = sc.nextDouble();

        double custo = calcularCustoSelo(peso);

        System.out.printf("\nO custo do selo para uma carta de %.2f%n gramas é R$%.2f%n", peso, custo);

        sc.close();
    }

    public static double calcularCustoSelo(double peso) {
        if (peso <= 50) {
            return 0.45;
        } else {
            double pesoExcedente = peso - 50;
            int adicionais = (int) Math.ceil(pesoExcedente / 20);
            return 0.45 + adicionais * 0.45;
        }     
    }
}    