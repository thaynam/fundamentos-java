
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args){
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leTeclado.next();
        System.out.println("ola, " + nome);
        System.out.println("Digite um numero:");
        double num1 = leTeclado.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = leTeclado.nextDouble();
        double soma = num1 + num2;
        double media = soma/2.0;
        System.out.println("A media dos dois numeros e: "+media);

    }
}