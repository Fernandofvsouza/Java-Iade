import java.util.Scanner;
/*
crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo
de cédulas para um determinado valor informado pelo usuário considerando notas de 100, 50,
20, 10 e 5 euros. Seu programa deve mostrar apenas as notas utilizadas. Por exemplo, ao
solicitar 35 euros, o programa deve informar apenas a seguinte informação (note que não foram
exibidas informações sobre as demais cédulas):
1 nota(s) de 20 euros.
1 nota(s) de 10 euros.
1 nota(s) de 5 euros
*/


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int valor;
        System.out.print("Informe o valor em euros: ");
        valor = input.nextInt();
        
        int notas100, notas50, notas20, notas10, notas5;
        
        notas100 = valor / 100;
        valor = valor % 100;
        
        notas50 = valor / 50;
        valor = valor % 50;
        
        notas20 = valor / 20;
        valor = valor % 20;
        
        notas10 = valor / 10;
        valor = valor % 10;
        
        notas5 = valor / 5;
        valor = valor % 5;
        
        if (notas100 > 0){
            System.out.println(notas100 + " nota(s) de 100 euros.");
        }
        if (notas50 > 0){
            System.out.println(notas50 + " nota(s) de 50 euros.");
        }
        if (notas20 > 0){
            System.out.println(notas20 + " nota(s) de 20 euros.");
        }
        if (notas10 > 0){
            System.out.println(notas10 + " nota(s) de 10 euros.");
        }
        if (notas5 > 0){
            System.out.println(notas5 + " nota(s) de 5 euros.");
        }
        
        input.close();
    }
}
