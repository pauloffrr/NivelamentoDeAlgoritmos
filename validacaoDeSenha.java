import java.util.Scanner;

public class validacaoDeSenha {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer senhaCorreta = 12345, quantidadeMaxTentativas = 3;
        Integer senhaDigitada = 0, quantidadeTentativas = 0;

        do {
            System.out.println("informe a senha: ");
            senhaDigitada = prompt.nextInt();
            if (!senhaDigitada.equals(senhaCorreta)){
                System.out.println("a senha está incorreta");
                quantidadeTentativas++;
            }
        }while (!senhaDigitada.equals(senhaCorreta) && quantidadeTentativas < quantidadeMaxTentativas);

        if (quantidadeTentativas.equals(quantidadeMaxTentativas)) {
            System.out.println("sua conta está bloqueada por errar mais de "+quantidadeMaxTentativas+"X a senha");
        }else {
            System.out.println("senha correta");
        }
    }
}
