import java.util.Scanner;

public class Uri1014{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// variaveis
double consmedio;
double distotal;
double gastotal;

// entradas

distotal = teclado.nextDouble();
gastotal = teclado.nextDouble();

//contas
consmedio = distotal/gastotal;

//saida
//System.out.println("NUMBER = "+number);
System.out.printf("%.3f km/l\n",consmedio) ;

}
}