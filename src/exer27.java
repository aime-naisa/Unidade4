import java.util.Scanner;

public class exer27 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("horaChegada: ");
        int hChegada = scanner.nextInt();
        System.out.print("minChegada: ");
        int mChegada = scanner.nextInt();
        System.out.print("horaSaida: ");
        int hSaida = scanner.nextInt();
        System.out.print("minSaida: ");
        int mSaida = scanner.nextInt();

        if (!validaHora(hChegada, mChegada) || !validaHora(hSaida, mSaida)) {
            System.out.println("Dados inválidos.");
            scanner.close();
            return;
        }

        int chegadaTotalMin = hChegada * 60 + mChegada;
        int saidaTotalMin = hSaida * 60 + mSaida;

        if (saidaTotalMin < chegadaTotalMin) {
            System.out.println("Dados inválidos: saída antes da chegada.");
            scanner.close();
            return;
        }

        int duracaoMin = saidaTotalMin - chegadaTotalMin;

        int horas;
        if (duracaoMin <= 30) {
            horas = 1;
        } else {
            int resto = duracaoMin % 60;
            horas = duracaoMin / 60;
            if (resto > 29) {
                horas += 1;
            }
        }

        double preco = calculaPreco(horas);

        System.out.println("Tempo estacionado: " + duracaoMin / 60 + "h " + duracaoMin % 60 + "min");
        System.out.printf("Preço cobrado = R$%.2f\n", preco);

        scanner.close();
    }

    private static boolean validaHora(int h, int m) {
        return (h >= 0 && h <= 23) && (m >= 0 && m <= 59);
    }

    private static double calculaPreco(int horas) {
        double preco = 0;
        if (horas <= 2) {
            preco = horas * 5.0;
        } else if (horas <= 4) {
            preco = 2 * 5.0 + (horas - 2) * 7.5;
        } else {
            preco = 2 * 5.0 + 2 * 7.5 + (horas - 4) * 10.0;
        }
        return preco;
    }
}
