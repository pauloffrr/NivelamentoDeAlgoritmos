import java.util.Scanner;

public class exemploDELF2 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.print("informe um valor inteiro: ");
        Integer numeroInteiro = prompt.nextInt();

        if(numeroInteiro%2 == 0) {
            System.out.println("o numero "+numeroInteiro+ " é um numero par");
        }else {
            System.out.println("o numero" +numeroInteiro+" é um numeor impar");
        }
    }
}
