import java.util.Scanner;

public class CompMaiorNumeroEntreValoresPT3 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer numero,maiorValor=0,maiorPosicao=0;
        final Integer quantidade = 5;

        for (int i = 1;i<=quantidade;i++){
              System.out.println("Informe o "+i+"º valor: ");
              numero = prompt.nextInt();
              if (i==1){
                  maiorValor = numero;
                  maiorPosicao = i;
              }else if (numero > maiorValor) {
                  maiorValor = numero;
                  maiorPosicao = i;
              }
        }

        System.out.println("o maior valor informado foi "+maiorValor+" e a maior posição foi a "+maiorPosicao+"º");

    }
}
