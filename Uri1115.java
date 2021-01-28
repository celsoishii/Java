import java.util.Scanner;
public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
    int x;
    int y;
    int contador=0;

    //iteracao
    while (contador < 1){
        x = teclado.nextInt();
        y = teclado.nextInt();
        if (x>0 && y>0){
            System.out.println("primeiro");
                }
        else if (x<0 && y>0) {
            System.out.println("segundo");
        }
        else if (x<0 && y<0) {
            System.out.println("terceiro");
        }
        else if (x>0 && y<0) {
            System.out.println("quarto");
        }
        else {contador++;
        }
    }



    }
}