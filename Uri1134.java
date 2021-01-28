import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
    int alcool=0;
    int gasolina=0;
    int diesel=0;
    int x=0;
    int contador=0;

    //iteracao

    while (contador <1){
            x = teclado.nextInt();
        if (x==1){
            alcool++;
                }
        else if (x==2) {
            gasolina++;
        }
        else if (x==3) {
            diesel++;
        }
       else if (x==4){
           contador++;
       } 
           
    }

    //saida

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alcool);
    System.out.println("Gasolina: "+gasolina);
    System.out.println("Diesel: "+diesel);

    }
}