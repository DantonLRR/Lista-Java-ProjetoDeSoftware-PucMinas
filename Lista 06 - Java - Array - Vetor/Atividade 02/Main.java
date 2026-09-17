// Preencha dois vetores de 10 posições cada a partir do teclado. Some os elementos das
// posições correspondentes em cada vetor e os armazene num terceiro vetor de 10
// posições. Apresente os 3 vetores na tela.
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para o  primeiro vetor na posição " + i + ": ");
             System.out.println("Digite o " + (i+1) + " número: ");
            vetor1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para o segundo vetor na posição " + i + ": ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.print("Vetor 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 3: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}