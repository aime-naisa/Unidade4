import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro irmão: ");
        int id1 = sc.nextInt();

        System.out.print("Digite a idade do segundo irmão: ");
        int id2 = sc.nextInt();

        System.out.print("Digite a idade do terceiro irmão: ");
        int id3 = sc.nextInt();

        if ( id1 == id2 && id2 == id3) {
            System.out.println("TRIGÊMEOS");
        } else if (id1 == id2 || id1 == id3 || id2 == id3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

        sc.close();
    }
}