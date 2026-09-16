import java.util.Scanner;
//Receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit. OBS: F = (C * 1,8) + 32.
class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius");
        double tempCelcius = sc.nextDouble();

        double tempFahrenheit = (tempCelcius * 1.8) + 32;

        System.out.println("A temperatura digitada convertida para Fahrenheit é: "+ tempFahrenheit + "°F");

        sc.close();
    }

}