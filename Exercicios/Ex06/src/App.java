import java.util.Scanner;
/*
2- Um comerciante comprou um produto e quer vende-lo com lucros diferentes dependendo do valor da compra, ele quer um lucro de 45% se o valor da compra for menor do que 20euros, 35% se o proço for ate 50 euros e lucro de 25% se o valor for maior, entrar com o valor do produto e imprimir na tela o valor da venda
*/
public class App {
    public static void main(){
        Scanner input = new Scanner(System.in);
        float valorProduto, valorVenda;
        System.out.print("Qual o valor do produto: ");
        valorProduto = input.nextFloat();
        if(valorProduto <= 20){
            valorVenda = valorProduto * 1.45f;
            System.out.println("O valor da venda é de: " + valorVenda);
        }else if(valorProduto <= 50 && valorProduto > 20){
            valorVenda = valorProduto * 1.35f;
            System.out.println("O valor da venda é de: " + valorVenda);
        }else{
            valorVenda = valorProduto * 1.25f;
            System.out.println("O valor da venda é de: " + valorVenda);
        }
    }
}
