import java.util.Scanner;
/*
Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
1 - À vista em dinheiro, recebe 10% de desconto
2 - À vista no cartão de débito, preço normal da etiqueta
3 - Em duas vezes, preço normal de etiqueta mais juros de 10%
4 - Em três vezes, preço normal de etiqueta mais juros de 15%

*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float valorDoProduto, valorFinal, desconto, acrescimo;
        int formaDePagamento;
        System.out.print("Qual o valor do produto? ");
        valorDoProduto = input.nextFloat();
        System.out.println(
            "Qual é forma do pagamento\n" +
            "Digite: 1 = À vista em dinheiro\n"+
            "Digite: 2 = À vista no cartão de débito\n" +
            "Digite: 3 = Em duas vezes\n" +
            "Digite: 4 = Em três vezes"
        );
        formaDePagamento = input.nextInt();

        switch (formaDePagamento) {
            case 1:
                desconto = valorDoProduto * 0.10f;
                valorFinal = valorDoProduto - desconto;
                System.out.println("O valor final do produto é: " + valorFinal);
                break;
            case 2:
                System.out.println("O valor final do produto é: " + valorDoProduto);
                break;
            case 3:
                acrescimo = valorDoProduto * 0.10f;
                valorFinal = valorDoProduto + acrescimo;
                System.out.println("O valor final do produto é: " + valorFinal);
                break;    
            case 4:
                acrescimo = valorDoProduto * 0.15f;
                valorFinal = valorDoProduto + acrescimo;
                System.out.println("O valor final do produto é: " + valorFinal);
                break;     
            default:
                System.out.println("Digite um valor valido");
        }
    }
}
