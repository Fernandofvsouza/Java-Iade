
import java.util.Scanner;

/*
Construa um algoritmo para determinar se o indivíduo esta com um peso
favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é
definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do
indivíduo. Ou seja,
Imc abaixo de 20 = Abaixo do peso
Imc de 20 ate 25 = peso normal
imc de 25 ate 30 = acima do peso
imc de 30 ate 40 = obeso
imc acima de 40 = obesidade morbida
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float peso, altura, imc;
        System.out.print("Qual o seu peso? ");
        peso = input.nextFloat();
        System.out.print("Qual a sua altura? ");
        altura = input.nextFloat();
        imc = peso / (altura * altura);
        if(imc < 20){
            System.out.println("Voce está abaixo do peso");
        }else if (imc >= 20 && imc < 25){
            System.out.println("Voce está no peso ideal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Voce está acima do peso");
        }else if(imc >= 30 && imc < 40){
            System.out.println("Voce está com obesidade");
        }else{
            System.out.println("Voce está com obesidade morbida");
        }
        input.close();
    }
}
