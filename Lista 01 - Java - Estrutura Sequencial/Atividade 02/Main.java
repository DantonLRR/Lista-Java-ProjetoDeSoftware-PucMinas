import java.util.Scanner;
//2) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, 
// //sabendo-se que ele teve um aumento de 25%.
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário");
        double salario = sc.nextDouble();

        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;

        System.out.println("O novo salario com 25% de aumento é: " +novoSalario);
         sc.close();
    }

}