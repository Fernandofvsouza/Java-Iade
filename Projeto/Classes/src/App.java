import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Classes e objetos
        Scanner input = new Scanner(System.in);//Scanner é uma classe
        //Passando o objeto pessoa da classe Pessoa
        Pessoa pessoa1; //Declaração do objeto
        pessoa1 = new Pessoa(); //Instanciação do objeto
        System.out.print("Digite o nome: ");
        pessoa1.nome = input.nextLine();
        pessoa1.setIdade(25); //Usando o setter para definir a idade
        System.out.print("Digite a altura: ");
        pessoa1.altura = input.nextFloat();
        System.out.println("Nome: " + pessoa1.getNome()); //Usando o getter para obter o nome
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura: " + pessoa1.altura);
        pessoa1.falar();
        input.close();
    }
}
