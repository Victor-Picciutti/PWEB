import java.util.Scanner;

public class CalculoIMC
{
    public static void main(String[] args)
    {

      float peso, altura, res;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu peso");
        peso = ler.nextFloat();

        System.out.println("Digite sua altura");
        altura = ler.nextFloat();

        res = peso/(altura * altura);

        System.out.printf("O seu imc é de: %.1f \n", res);

        if(res < 18.5 )
        {
            System.out.println("Abaixo do peso");
        } 
        else if (res >= 18.5 && res <= 24.9)
        {
            System.out.println("Peso normal");
        }
        else if (res >= 25 && res <= 29.9)
        {
            System.out.println("Sobrepeso");
        }
        else
        {
            System.out.println("Obesidade");
        }

    }
}
