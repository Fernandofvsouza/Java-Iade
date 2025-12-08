import java.util.Scanner;
/*
1- implementar um programa que calcula o desconto previdenciario de um funcionario,  a programa deve, dado um salario retornar o valor do desconto proporcional ao mesmo, entretanto o calculo do desconto segue a regra: o desconto deve 11% do calor do salario, entretando o valor maximo de desconto é 120 euros, sendo assim ou o desconto é 11% do salario ou 120 euros
*/
public class App {
    public static void main(){
        Scanner input = new Scanner(System.in);
        float salario, desconto;
        System.out.print("Digite o salario do funcionario: ");
        salario = input.nextFloat();
        desconto = salario * 0.11f;
        if(desconto >= 121){
            desconto = 121;
            System.out.println("O desconto previdenciario e: " + desconto + " euros");
        }else{
            
            System.out.println("O desconto previdenciario e: " + desconto + " euros");
        };
        

    }
}
