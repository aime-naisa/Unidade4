import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade de Marquinhos: ");
        int idM = sc.nextInt();

        System.out.print("Idade de Zezinho: ");
        int idZ = sc.nextInt();

        System.out.print("Idade de Luluzinha: ");
        int idL = sc.nextInt();

        if (idM < idZ && idM < idL) {
            System.out.println("O Marquinhos é o caçula!");
        } else if (idZ < idM && idZ < idM) {
            System.out.println("O Zezinho é o caçula!");
        } else {
            System.out.println("A Luluzinha é a caçula!");
        }

        sc.close();
    }
}