// Leia uma quantidade indeterminada de idades e que calcule e mostre a média das
// idades informadas

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int idade = 0;

        for (int i = 0; idade >= 0; i++) {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            if (idade >= 0) {
                soma += idade;
                quantidade++;
            }
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média das idades é: " + media);
        }

        sc.close();
    }
}
