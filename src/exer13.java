import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira carta: ");
        int carta1 = sc.nextInt();

        System.out.print("Digite a segunda carta: ");
        int carta2 = sc.nextInt();

        System.out.print("Digite a terceira carta: ");
        int carta3 = sc.nextInt();

        int boas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            boas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            boas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            boas++;
        }

        if (boas == 1) {
            System.out.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        }
    
        sc.close();
    }
}