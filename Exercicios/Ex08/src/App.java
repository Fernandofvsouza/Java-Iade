import java.util.Scanner;
/*
A confederação portuguesa de natação irá promover eliminatórias para o próximo mundial.
Fazer um algoritmo que receba a idade de um nadador e imprima a sua categoria segundo a
tabela a seguir:
Infantil a- 5-7anos
infantil b- 8-10anos
juvenil a- 11-13anos
juvenil b- 14-17 anos
senior- >18anos

*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();
        if(idade >= 5 && idade <= 7){
            System.out.println("A sua categoria é Infantil A");
        }
        else if(idade >= 8 && idade <= 10){
            System.out.println("A sua categoria é Infantil B");
        }
        else if(idade >= 11 && idade <= 13){
            System.out.println("A sua categoria é Juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("A sua categoria é Juvenil B");
        }else if(idade >= 18){
            System.out.println("A sua categoria é Senior");
        }
        input.close();
        
    }
}
