import java.util.Scanner;

//     Escreva um programa para ler 5 valores (considere que não serão
//     informados valores iguais) e escrever o maior deles e qual posição
//     que ele foi informado.

public class ComparacaoMaiorNumeroEntre5Valores {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer maiorValor,maiorPosicao;

        System.out.println("informe o primeiro valor: ");
        Integer numero1 = prompt.nextInt();
        maiorValor = numero1;
        maiorPosicao = 1;

        System.out.println("informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();
        if (numero2 > maiorValor){
            maiorValor = numero2;
            maiorPosicao = 2;
        }

        System.out.println("informe o terceiro valor: ");
        Integer numero3 = prompt.nextInt();
        if (numero3 > maiorValor) {
            maiorValor = numero3;
            maiorPosicao = 3;

        }

        System.out.println("informe o quarto valor: ");
        Integer numero4 = prompt.nextInt();
        if (numero4 > maiorValor) {
            maiorValor = numero4;
            maiorPosicao = 4;
        }

        System.out.println("informe o quinto valor: ");
        Integer numero5 = prompt.nextInt();
        if (numero5 > maiorValor) {
            maiorValor = numero5;
            maiorPosicao = 5;
        }

        System.out.println("o maior valor informado foi "+maiorValor+" e a maior posição foi a "+maiorPosicao+"º");

    }
}