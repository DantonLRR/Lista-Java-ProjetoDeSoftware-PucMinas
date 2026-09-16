import java.util.Scanner;
//3) Calcule e apresente a área de um losango. As diagonais maior e menor do losango
//devem ser informadas pelo usuário. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.

class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular área de um losango");
        System.out.println("Digite a medida da DIAGONAL MAIOR");
        double DiagonalMaior = sc.nextDouble();

        System.out.println("Digite a medida da DIAGONAL MENOR");
        double DiagonalMenor = sc.nextDouble();

        Double Area = (DiagonalMaior * DiagonalMenor )/2;

        System.out.println("A area do Losango digitado é: "+ Area);
        sc.close();

    }

}