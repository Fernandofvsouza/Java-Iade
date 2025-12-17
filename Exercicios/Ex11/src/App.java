import java.util.Scanner;
//Crie um algoritmo que leia o valor do salario minimo e o valor do salario de um usuario, calcule a quantidade de salarios minimos esse usuario ganha e imprime o resultado.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float seuSalario, salarioMinimo, quantidadeSalariosMinimos;
        
        System.out.print("Qual o seu salario?");
        seuSalario = input.nextFloat();
        System.out.print("Qual o salario minimo ?");
        salarioMinimo = input.nextFloat();
        quantidadeSalariosMinimos = seuSalario / salarioMinimo;
        System.out.printf("Voce recebe %.2f salarios minimos", quantidadeSalariosMinimos);
        input.close();
    }
}
