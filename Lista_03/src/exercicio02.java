import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1;
        System.out.println("digite o primeiro numero");
        num = scanner.nextInt();
        System.out.println("digite o segundo numero");
        num1 = scanner.nextInt();
        if (num>num1){
            System.out.println("entao num e maior que num1");
        }else{
            System.out.println("entao num1 e maior que num ");
        }

    }
}
