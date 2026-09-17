// Leia e valide os seguintes dados:
// a. Nota: entre 0 e 100.
// b. Salário: maior que zero.
// c. Sexo: m ou f.
// d. Idade: entre 0 e 110.
// Quando o dado for informado corretamente, o algoritmo deve apresentar uma
// mensagem de sucesso e finalizar.
// Quando o dado for informado incorretamente, o algoritmo deve exigir que o usuário o
// informe novamente até que seja válido.
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double nota;
        do {
            System.out.println("Digite a nota: ");
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 100);
        System.out.println("Nota válida!");

        double salario;
        do {
            System.out.println("Digite o salário: ");
            salario = sc.nextDouble();
        } while (salario <= 0);
        System.out.println("Salário válido!");

        char sexo;
        do {
            System.out.println("Digite o sexo (m ou f): ");
            sexo = sc.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f');
        System.out.println("Sexo válido!");

        int idade;
        do {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 110);
        System.out.println("Idade válida!");

        sc.close();
    }
}