// Calcule o fatorial de um número. O fatorial de um número n é representado por n! e é
// calculado como apresentado abaixo:
// n! = n x (n – 1) x (n – 2) x ... x 2 x 1, para n > 0 e 0! = 1.
// Exemplos:
// 5! = 5 x 4 x 3 x 2 x 1 = 120
// 4! = 4 x 3 x 2 x 1 = 24
// 3! = 3 x 2 x 1 = 6
// 2! = 2 x 1 = 2
// 1! = 1
// 0! = 1 (OBS: o fatorial de 0 é sempre 1).
// O algoritmo deve ler um número natural informado pelo usuário a partir do teclado e
// informar o fatorial desse número. Se o usuário inserir um número negativo, o algoritmo
// deve informar que o número é inválido.

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número inválido");
        } else {
            double fat = 1;

            for (int i = 1; i <= n; i++) {
                fat *= i;
            }

            System.out.println("O fatorial é: " + fat);
        }

        sc.close();
    }
}
