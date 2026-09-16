// Determine a situação de peso de um indivíduo determinada através do IMC (Índice de
// Massa Corpórea). O IMC é definido como a relação entre o peso (em kg) e o quadrado
// da Altura (em m) do indivíduo: IMC = PESO / ALTURA2. A situação do peso é indicada na
// tabela ao lado:
// Condição Situação
// IMC abaixo de 20 Abaixo do Peso
// IMC de 20 até 25 Normal
// IMC de 25 até 30 Sobrepeso
// IMC de 30 até 40 Obesidade
// IMC acima de 40 Obesidade Mórbida
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / Math.pow(altura,2);
        if(IMC< 20){
            System.out.println("Valor do IMC: "+ IMC + " Situação: Abaixo do Peso");
        }else if(IMC>= 20 && IMC <25){
            System.out.println("Valor do IMC: "+ IMC + " Situação: Normal");
        }else if(IMC>= 25 && IMC <30){
            System.out.println("Valor do IMC: "+ IMC + " Situação: Sobrepeso");
        }else if(IMC>= 30 && IMC <40){
            System.out.println("Valor do IMC: "+ IMC + " Situação: Obesidade");
        }else if(IMC>= 40 ){
            System.out.println("Valor do IMC: "+ IMC + " Situação: Obesidade Mórbida");
        }

        sc.close();
    }
}