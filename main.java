import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente;

        do {
            int segredo = random.nextInt(100) + 1;
            int tentativas = 0;
            int palpite;

            System.out.println("\nPensei em um número entre 1 e 100. Tente adivinhar!");

            do {
                System.out.print("Seu palpite: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Digite apenas números inteiros.");
                    scanner.next();
                    palpite = -1;
                    continue;
                }

                palpite = scanner.nextInt();
                tentativas++;

                if (palpite < segredo) {
                    System.out.println("Maior!");
                } else if (palpite > segredo) {
                    System.out.println("Menor!");
                } else {
                    System.out.println("Acertou em " + tentativas + " tentativa(s)!");
                }
            } while (palpite != segredo);

            System.out.print("Jogar novamente? (s/n): ");
            jogarNovamente = scanner.next().equalsIgnoreCase("s");

        } while (jogarNovamente);

        System.out.println("Até a próxima!");
        scanner.close();
    }
}