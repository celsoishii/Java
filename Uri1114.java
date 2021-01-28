import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int senha;
    int contador=0;

    //iteracao
    while (contador < 1){
        senha = teclado.nextInt();
        if (senha==2002){
            System.out.println("Acesso Permitido");
            contador++;
        }
        else {
            System.out.println("Senha Invalida");
        }
    }



    }
}