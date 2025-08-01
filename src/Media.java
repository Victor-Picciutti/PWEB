import java.util.Scanner;

public class Media
{
    public static void main(String[] args)
    {
        //declarar um objeto
        Scanner leitor = new Scanner(System.in);

        //declaração de variável
        double n1, n2, res;
        String nomeAluno;

        //saida, entrada e processamento

        System.out.println("Digite seu nome: ");
        nomeAluno = leitor.nextLine();
        System.out.println("Digite o primeiro numero: ");//sout
        n1 = leitor.nextDouble();
        System.out.println("Digite o segundo numero: ");//sout
        n2 = leitor.nextDouble();

        res = (n1 + n2) / 2;

        System.out.println("O aluno " + nomeAluno + " teve media - " + res);

    }

}
