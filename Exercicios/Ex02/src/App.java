/*
Faça um algoritmo para calcular quantas ferraduras são necessarias para equipar todos os cavalos comprados para um haras.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int ferradurasPorCavalo, numeroDeCavalos;
        float totalDeFerraduras;

        System.out.print("Digite o número de cavalos comprados para o haras: ");
        numeroDeCavalos = input.nextInt();
        ferradurasPorCavalo = 4;
        totalDeFerraduras = numeroDeCavalos * ferradurasPorCavalo;
        System.out.println("O total de ferraduras necessárias para equipar todos os cavalos é: " + totalDeFerraduras);
        input.close();
    }
}
