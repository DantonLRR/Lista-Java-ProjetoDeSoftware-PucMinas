// Receba o raio, calcule e apresente:
// a. O comprimento de uma circunferência: C = 2 * π * R.
// b. A área de um círculo: A = π * R2
// c. A área da superfície de uma esfera: A = 4 * π * R2
// d. O volume de uma esfera: V = 4/3 * π * R3.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("insira o raio: ");
        Double raio = sc.nextDouble();
        
        double circunferencia = 2 * Math.PI * raio;
        double Area = Math.PI * Math.pow(raio,2);
        double AreaSuperficie = 4 * Math.PI * Math.pow(raio,2);
        double volume = 4.0/3.0 * (Math.PI * Math.pow(raio,3));

        System.out.println("A o comprimento de uma circunferência é: "+circunferencia);
        System.out.println("A área de um círculo é: "+ Area);
        System.out.println("A área da superfície de uma esfera: "+ AreaSuperficie);
        System.out.println("O volume de uma esfera: "+ volume);
        sc.close();
    }
}
