
// Informe o preço dos produtos de uma loja, conforme indicado na tabela abaixo. O
// algoritmo deve receber o código do produto como entrada.
// Código Produto Preço
// 1 Sapato R$ 99,99
// 2 Bolsa R$ 103,89
// 3 Camisa R$ 49,98
// 4 Calça R$ 89,72
// 5 Blusa R$ 97,35
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo do produto desejado: ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Produto: Sapato, Valor:R$ 99,99");
                break;
            case 2:
                System.out.println("Produto: Bolsa, Valor:R$ 103,89");
                break;
            case 3:
                System.out.println("Produto: Camisa, Valor:R$ 49,98");
                break;
            case 4:
                System.out.println("Produto: Calça, Valor:R$ 89,72");
                break;
            case 5:
                System.out.println("Produto: Blusa, Valor:R$ 97,35");
                break;

            default:
                System.out.println("Código de produto não encontrado.");
                break;
        }
        sc.close();
    }
}