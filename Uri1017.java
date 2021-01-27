import java.util.Scanner;

public class Uri1017{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// variaveis
int tempo;
double velmedia;
double distancia;
double litros;

// entradas

tempo = teclado.nextInt();
velmedia = teclado.nextDouble();

//contas
litros = tempo*velmedia/12;

//saida
//System.out.println("NUMBER = "+number);
System.out.printf("%.3f\n",litros) ;

}
}