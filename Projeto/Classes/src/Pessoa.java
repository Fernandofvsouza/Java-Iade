public class Pessoa {
    //Atributos, características da classe Pessoa (Variaveis)
    public String nome;
    protected  int idade;
    public float altura;
    //PUBLIC - Atributos e métodos podem ser acessados por outras classes
    //PRIVATE - Atributos e métodos só podem ser acessados dentro da própria classe
    //PROTECTED - Atributos e métodos podem ser acessados por classes do mesmo pacote ou subclasses

    //Metodos, comportamentos da classe Pessoa (Funções)
    public void falar(){
        System.out.println("Olá, eu sou o " + nome + " minha idade é " + idade + " anos e minha altura é " + altura + " metros.");
    }
    //VOID - Método que não retorna valor

    //Getters e Setters (Métodos de acesso)
    //Getter é um método que retorna o valor de um atributo
    public String getNome(){
        return nome;   
    }
    //setter é um método que atribui um valor a um atributo
    public void setIdade(int idade){
        this.idade = idade;
    }
}
