//5) Receba o valor do salário mínimo e o valor do salário de um funcionário. O algoritmo
//deve calcular e apresentar a quantidade de salários mínimos que esse funcionário recebe.

import java.util.Scanner;
class Main{
  public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário minimo: ");
        double salMin = sc.nextDouble();


        System.out.println("Digite o valor do salário de um funcionário: ");
        double salFunc = sc.nextDouble();

        double qntSalarios = salFunc/salMin;

        System.out.println("O salário desse funcionário reseprenta "+ qntSalarios +" de salários mínimos");
        sc.close();
    }
}