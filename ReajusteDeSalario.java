public class ReajusteDeSalario {
    public static void main(String[] args) {
        double salario = 3500;
        //quem ganha ate 1412 - reajuste de 12%
        //quem ganha ate 3000 - reajuste de 9%
        //quem ganha ate 5000 - reajuste de 5%
        //quem ganha mais de 5000 - sem reajuste

        if(salario <= 1412) {
            System.out.println("Reajuste de 12%");
        }else if(salario <= 3000){
            System.out.println("reajuste de 9%");
        } else if (salario <=5000) {
            System.out.println("reajuste de 5%");
        }else{
            System.out.println("sem reajuste");
        }
    }
}
