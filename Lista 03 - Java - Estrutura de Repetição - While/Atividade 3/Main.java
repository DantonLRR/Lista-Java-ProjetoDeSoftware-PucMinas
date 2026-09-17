import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 0;
        int pessoas2 = 0;
        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas7 = 0;
        int pessoas12 = 0;

        System.out.println("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para encerrar: ");
        int canal = sc.nextInt();

        while (canal != 0) {
            System.out.println("Digite o número de pessoas assistindo a este canal: ");
            int pessoas = sc.nextInt();

            if (canal == 2) {
                pessoas2 += pessoas;
                totalPessoas += pessoas;
            } else if (canal == 4) {
                pessoas4 += pessoas;
                totalPessoas += pessoas;
            } else if (canal == 5) {
                pessoas5 += pessoas;
                totalPessoas += pessoas;
            } else if (canal == 7) {
                pessoas7 += pessoas;
                totalPessoas += pessoas;
            } else if (canal == 12) {
                pessoas12 += pessoas;
                totalPessoas += pessoas;
            } else {
                System.out.println("Canal inválido! Insira um canal permitido (2, 4, 5, 7, 12).");
            }

            System.out.println("Digite o número do próximo canal (ou 0 para encerrar): ");
            canal = sc.nextInt();
        }

        if (totalPessoas > 0) {
            double perc2 = (double) pessoas2 / totalPessoas * 100;
            double perc4 = (double) pessoas4 / totalPessoas * 100;
            double perc5 = (double) pessoas5 / totalPessoas * 100;
            double perc7 = (double) pessoas7 / totalPessoas * 100;
            double perc12 = (double) pessoas12 / totalPessoas * 100;

            System.out.println("\n--- PERCENTUAL DE AUDIÊNCIA DOS CANAIS ---");
            System.out.println("Canal 2: " + perc2 + "%");
            System.out.println("Canal 4: " + perc4 + "%");
            System.out.println("Canal 5: " + perc5 + "%");
            System.out.println("Canal 7: " + perc7 + "%");
            System.out.println("Canal 12: " + perc12 + "%");
        } else {
            System.out.println("Nenhum dado de audiência foi registrado.");
        }

        sc.close();
    }
}