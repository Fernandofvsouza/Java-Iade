import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    float altura;

    System.out.print("Escreva o seu nome: ");
    nome = input.nextLine();
    System.out.print("Qual a sua idade?");
    idade = input.nextInt();
    System.out.print("Qual a sua altura?");
    altura = input.nextFloat();
    System.out.println("Ola, " + nome + "!" + " Voce tem " + idade + " anos." + " Sua altura e " + altura + " metros.");
    
  }
}
