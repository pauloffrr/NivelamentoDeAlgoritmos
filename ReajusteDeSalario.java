import java.util.Scanner;

public class ReajusteDeSalario {
    public static void main(String[] args) {
        System.out.println("insira seu salário: ");
        Scanner prompt = new Scanner(System.in);
        double salario = prompt.nextDouble();
        //quem ganha ate 1412 - reajuste de 12%
        //quem ganha ate 3000 - reajuste de 9%
        //quem ganha ate 5000 - reajuste de 5%
        //quem ganha mais de 5000 - sem reajuste

        if(salario <= 1412) {
            System.out.println("Reajuste de 12%, seu reajuste é de R$" +salario*12/100);
        }else if(salario <= 3000){
            System.out.println("reajuste de 9%, seu reajuste é de R$" +salario*9/100);
        } else if (salario <=5000) {
            System.out.println("reajuste de 5%, seu reajuste é de R$" +salario*5/100);
        }else{
            System.out.println("sem reajuste");
        }
    }
}
