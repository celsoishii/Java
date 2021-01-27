import java.util.Scanner;

public class Uri1010{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// variaveis
int codpeca1;
int codpeca2;
int numpeca1;
int numpeca2;
double valorpeca1;
double valorpeca2;
double valorpagar;

// entradas
codpeca1 = teclado.nextInt();
numpeca1 = teclado.nextInt();
valorpeca1 = teclado.nextDouble();
codpeca2 = teclado.nextInt();
numpeca2 = teclado.nextInt();
valorpeca2 = teclado.nextDouble();

//contas
valorpagar = numpeca1*valorpeca1 + numpeca2*valorpeca2;

//saida
//System.out.println("NUMBER = "+number);
System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorpagar);



}
}