// Leia 10 números inteiros a partir do teclado e os armazene em um vetor. O algoritmo
// deve:
// a. Imprimir o vetor lido.
// b. Apresentar a soma dos números pares armazenados no vetor.
// c. Imprimir as posições do vetor que armazenam números negativos.
// d. Imprimir o menor e o maior número informado.
// e. Imprimir os elementos armazenados nas posições ímpares do vetor.

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor lido: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int somaPares = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            }
        }
        System.out.println("Soma dos números pares: " + somaPares);

        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        System.out.print("Elementos nas posições ímpares: ");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}