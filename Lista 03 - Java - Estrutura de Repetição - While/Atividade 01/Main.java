import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int qtdNota90 = 0;
        int qtdReprovados = 0;
        double maiorNota = 0;
        double menorNota = 0;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Digite a nota final do aluno (ou um valor negativo para encerrar): ");
        double nota = sc.nextDouble();

        if (nota >= 0) {
            maiorNota = nota;
            menorNota = nota;
        }

        while (nota >= 0) {
            System.out.println("Digite o total de faltas do aluno: ");
            int faltas = sc.nextInt();

            totalAlunos++;
            somaNotas += nota;

            // a. Quantidade de alunos com nota maior ou igual a 90
            if (nota >= 90) {
                qtdNota90++;
            }

            // b. Reprovados por nota (< 70) ou por falta (>= 20)
            if (nota < 70 || faltas >= 20) {
                qtdReprovados++;
            }

            // c. Verificando a maior e a menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            System.out.println("Digite a nota final do próximo aluno (ou um valor negativo para encerrar): ");
            nota = sc.nextDouble();
        }

        // Exibição dos resultados finais se houver pelo menos um aluno cadastrado
        if (totalAlunos > 0) {
            double mediaTurma = somaNotas / totalAlunos;

            System.out.println("--- RESULTADOS DA TURMA ---");
            System.out.println("a. Alunos com nota >= 90: " + qtdNota90);
            System.out.println("b. Alunos reprovados (nota < 70 ou faltas >= 20): " + qtdReprovados);
            System.out.println("c. Maior nota: " + maiorNota);
            System.out.println("c. Menor nota: " + menorNota);
            System.out.println("d. Média de notas da turma: " + mediaTurma);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }

        sc.close();
    }
}