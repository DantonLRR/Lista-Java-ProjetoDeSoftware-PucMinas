import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a matrícula do aluno (ou um valor negativo para encerrar): ");
        int matricula = sc.nextInt();

        while (matricula >= 0) {
            System.out.println("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 70) {
                System.out.println("Matrícula: " + matricula + " | Média: " + media + " | Situação: APROVADO");
            } else if (media >= 60 && media < 70) {
                System.out.println("Matrícula: " + matricula + " | Média: " + media + " | Situação: RECUPERAÇÃO");
            } else {
                System.out.println("Matrícula: " + matricula + " | Média: " + media + " | Situação: REPROVADO");
            }

            System.out.println("Digite a matrícula do próximo aluno (ou um valor negativo para encerrar): ");
            matricula = sc.nextInt();
        }

        sc.close();
    }
}