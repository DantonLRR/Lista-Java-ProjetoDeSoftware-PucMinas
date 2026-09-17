// Implemente um jogo simples onde o usuário tenta adivinhar um número secreto entre 1
// e 100. O algoritmo deve:
// • Gerar um número aleatório entre 1 e 100.
// • Pedir ao usuário que tente adivinhar o número gerado.
// • Informar se o palpite está acima ou abaixo do número secreto.
// • Continuar o jogo até que o usuário acerte o número secreto ou desista.
// • Permitir que o usuário jogue novamente quantas vezes ele desejar.
// • Empregar a classe Scanner para ler os palpites a partir do teclado.
// • Empregar Math.random() para gerar o número secreto.
// OBS:
// int numeroSecreto = (int) (Math.random() * 100) + 1;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char jogar;

        do {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int palpite;

            do {
                System.out.println("Digite seu palpite entre 1 e 100 (ou 0 para desistir): ");
                palpite = sc.nextInt();

                if (palpite == 0) {
                    System.out.println("Você desistiu. O número secreto era: " + numeroSecreto);
                    break;
                }

                if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor");
                } else if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é maior");
                } else {
                    System.out.println("Parabéns, você acertou!");
                }

            } while (palpite != numeroSecreto);

            System.out.println("Deseja jogar novamente? (s/n): ");
            jogar = sc.next().charAt(0);

        } while (jogar == 's' || jogar == 'S');

        sc.close();
    }
}