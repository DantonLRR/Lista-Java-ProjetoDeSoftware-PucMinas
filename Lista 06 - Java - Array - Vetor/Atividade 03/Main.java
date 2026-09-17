
// Leia 10 números inteiros a partir do teclado e os armazene em um vetor. O algoritmo
// deve:
// a. Somar os 5 números da primeira metade do vetor.
// b. Somar os 5 números da segunda metade do vetor.
// c. Calcular a diferença entre a primeira e a segunda soma.
// d. Apresentar os 3 valores calculados na tela.
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            vetor[i] = sc.nextInt();
        }

        int soma1 = 0;
        for (int i = 0; i < 5; i++) {
            soma1 += vetor[i];
        }

        int soma2 = 0;
        for (int i = 5; i < 10; i++) {
            soma2 += vetor[i];
        }

        int diferenca = soma1 - soma2;

        System.out.println("Soma da primeira metade: " + soma1);
        System.out.println("Soma da segunda metade: " + soma2);
        System.out.println("Diferença entre as somas: " + diferenca);

        sc.close();
    }
}