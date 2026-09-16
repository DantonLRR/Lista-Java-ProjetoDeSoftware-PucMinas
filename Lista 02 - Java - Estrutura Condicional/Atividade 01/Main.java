
// Receba 3 notas no intervalo [0, 10] de um aluno, calcule e apresente uma mensagem de
// acordo com sua média:
// MÉDIA             MENSAGEM
// >= 0 e < 3        REPROVADO
// >= 3 e < 7        EXAME
// >= 7 e <= 10      APROVADO
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite a Segunda nota: ");
        Double nota2 = sc.nextDouble();
        System.out.println("Digite a Terceira nota: ");
        Double nota3 = sc.nextDouble();

        Double media= (nota1+nota2+nota3)/3;
        if(media >=0 && media <3){
            System.out.println("A média do aluno foi de: "+media+" Portanto o aluno está REPROVADO");
        } else if(media >=3 && media <7){
            System.out.println("A média do aluno foi de: "+media+" Portanto o aluno terá que fazer um Exame para aprovação");
        } else if(media >=7 && media <=10){
            System.out.println("A média do aluno foi de: "+media+" Portanto o aluno está APROVADO");
        } else {
            System.out.println("Insira as notas conforme o intervalo intervalo indicado [0, 10]");
        }
        sc.close();
    }
}