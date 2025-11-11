import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dia do vencimento: ");
        int diaVencimento = scanner.nextInt();
        
        System.out.print("Dia do pagamento: ");
        int diaPagamento = scanner.nextInt();
        
        System.out.print("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();
        
        double valorFinal = valorPrestacao;
        
        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("O pagamento está em dia.");
            System.out.printf("O valor da prestação = R$ %.2f\n", valorFinal);
        } else if (diaPagamento <= diaVencimento + 5) { 
            System.out.println("O pagamento está atrasado. Perdeu o desconto.");
            System.out.printf("O valor da prestação = R$ %.2f\n", valorPrestacao);
        } else {
            int diasDeAtraso = diaPagamento - diaVencimento;
            double multa = 0.02 * diasDeAtraso * valorPrestacao;
            valorFinal = valorPrestacao + multa;
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso.");
            System.out.printf("O valor da prestação = R$ %.2f\n", valorFinal);
        }
        
        scanner.close();
    }
}
