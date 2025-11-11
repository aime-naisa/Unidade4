import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu sexo (F/M/I): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        if (sexo == 'F') {
            System.out.println("\nFeminino");
        } else if (sexo == 'M') {
            System.out.println("\nMaculino");
        } else if (sexo == 'I') {
            System.out.println("\nNão Informado");
        } else {
            System.out.println("\nEntrada Incorreta");
        }

        sc.close();
    }
}
