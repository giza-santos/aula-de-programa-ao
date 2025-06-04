import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        System.out.println("digite um numero");// *Exiba mensagem para usuário

        double  num; //*variavel com maior casas decimais
        Scanner in = new Scanner(System.in);//* espera que insira o valor
        num = in.nextDouble(); //*salva o valor  inserido pelo usuariom num


        if (num>0){ //* variavel se o numero maior que zero
            double raiz= Math.sqrt(num);//*raiz do numero
            System.out.println(raiz);

        }
        else{ //* se nao
            System.out.println("valor invalido!"); // *Mensagem para  usuario

        }


    }
}
