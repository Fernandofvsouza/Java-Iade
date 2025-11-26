/*
Um motorista deseja colocar no seu tanque x euros de combustivel, escreva um algoritmo para ler o preco do combustivel por litro e o valor em euros a ser colocado no tanque.
Calcule e escreva quantos litros de combustivel ele podera colocar no tanque.
*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        float precoLitro, valorEuros, litros;
        System.out.print("Digite o preco do combustivel por litro: ");
        precoLitro = input.nextFloat();
        System.out.print("Digite o valor em euros a ser colocado no tanque: ");
        valorEuros = input.nextFloat();
        litros = valorEuros / precoLitro;
        System.out.printf("Voce podera colocar %.2f litros de combustivel no tanque.%n", litros);
        input.close();
    }
}
