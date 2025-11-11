import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        if ((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
             || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("É Vogal!");   
             } else {
                System.out.println("Não é Vogal!");
             }

        sc.close();
    }
}