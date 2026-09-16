import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        Float nota1 = sc.nextFloat();

        System.out.println("Digite a nota 2: ");
        Float nota2 = sc.nextFloat();

        System.out.println("digite a nota 3: ");
        Float nota3 = sc.nextFloat();

        float media;
        media = (nota1 + nota2+ nota3)/3;

        System.out.println("A média das notas é: "+ media);

        sc.close();
    }

}