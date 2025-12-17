import java.util.Scanner;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos meses e dias e mostre-a expressa em dias. leve em consideração o ano com 365 dias e o mes com 30


public class App {
    public static void main(String[] args) throws Exception {
        int idadeAnos, idadeMeses, idadeDias, resultadoFinal, resultadoAnos, resultadoMeses;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        idadeAnos = input.nextInt();
        System.out.println("Quantos meses desde o seu ultimo aniversario? ");
        idadeMeses = input.nextInt();
        System.out.println("Quantos dias, desde o dia do seu aniversario? ");
        idadeDias = input.nextInt();
        resultadoAnos = idadeAnos * 365;
        resultadoMeses = idadeMeses * 30;
        resultadoFinal = resultadoAnos + resultadoMeses + idadeDias;
        System.out.println("No total são " + resultadoFinal + " dias");
        input.close();
    }
}
