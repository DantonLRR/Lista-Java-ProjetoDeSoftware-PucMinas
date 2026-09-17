// Calcule a média de notas inseridas pelo usuário. O algoritmo deve continuar pedindo
// novas notas até que o usuário decida parar. Apenas notas no intervalo de 0 a 10 são
// aceitas. Após cada nota, o algoritmo deve perguntar se o usuário deseja inserir outra.
// Quando o usuário não quiser informar uma nova nota, o algoritmo deve exibir a menor
// nota inserida, a média das notas inseridas e a maior nota inserida.

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;
        double maior = 0;
        double menor = 10;
        char continuar;

        do {
            do {
                System.out.println("Digite a nota (entre 0 e 10): ");
                nota = sc.nextDouble();
            } while (nota < 0 || nota > 10);

            soma += nota;
            quantidade++;

            if (quantidade == 1) {
                maior = nota;
                menor = nota;
            } else {
                if (nota > maior) {
                    maior = nota;
                }
                if (nota < menor) {
                    menor = nota;
                }
            }

            System.out.println("Deseja inserir outra nota? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Menor nota: " + menor);
            System.out.println("Média das notas: " + media);
            System.out.println("Maior nota: " + maior);
        }

        sc.close();
    }
}
