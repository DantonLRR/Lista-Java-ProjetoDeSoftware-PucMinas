//6) Receba os valores dos dois catetos de um triângulo, calcule e apresente o valor da hipotenusa. 
// OBS - Teorema de Pitágoras: a2 = b2 + c2.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro cateto: ");
        double cateto1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo cateto: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        
        System.out.println("O valor da hipotenusa é: "+hipotenusa);
        sc.close();
    }
}