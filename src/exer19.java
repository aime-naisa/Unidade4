import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        int x = scanner.nextInt();

        System.out.print("Y: ");
        int y = scanner.nextInt();

        int quadrante;

        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x > 0 && y < 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else if (x < 0 && y > 0) {
            quadrante = 4;
        } else {
            quadrante = -1;
        }

        if (quadrante >= 0) {
            System.out.println("Quadrante " + quadrante);
        } else {
            System.out.println("O ponto está sobre um dos eixos e não pertence a um quadrante definido.");
        }

        scanner.close();
    }
}
