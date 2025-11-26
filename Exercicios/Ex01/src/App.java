/*
A imobiliaria imobilis vende apenas terrenos retangulares. Faça um algoritmo que leia as dimensões do terreno (largura e comprimento), calcule e escreva a área do terreno em metros quadrados.
*/
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float largura, comprimento, area;
        System.out.print("Digite a largura do terreno (m): ");
        largura = input.nextFloat();
        System.out.print("Digite o comprimento do terreno (m): ");
        comprimento = input.nextFloat();
        area = largura * comprimento;
        System.out.println("A área do terreno é: " + area + " m²");
        input.close();
        
    }
}
