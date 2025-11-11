import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        double valor = sc.nextDouble();

        double valorResto = Math.abs(valor % 1);

        if (valorResto == 0) {
            System.out.println("Casas decimais não foram digitadas.");
         } else {
                System.out.println("Casas decimais foram digitadas.");
        }
        
        sc.close();
    }
}
