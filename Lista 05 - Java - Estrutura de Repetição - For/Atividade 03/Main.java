// Leia dois números inteiros e que imprima a potência do primeiro elevado ao segundo,
// utilizando somente operações de multiplicação. Não empregar a classe Math
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}