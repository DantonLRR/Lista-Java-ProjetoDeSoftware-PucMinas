// Leia uma quantidade indeterminada de idades e que calcule e mostre a média das
// idades informadas
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int idade = 0;

        System.out.println("Digite as idades (digite um número negativo para encerrar):");

        for (int i = 0; idade >= 0; i++) {
            System.out.print("Digite a " + (quantidade + 1) + "ª idade: ");
            idade = sc.nextInt();

            if (idade >= 0) {
                soma += idade;
                quantidade++;
            }
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        sc.close();
    }
}