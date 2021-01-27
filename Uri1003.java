import java.util.Scanner;

public class Uri1003{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

int valor1;
int valor2;
int resultado;

//System.out.println("Por favor, digite o primeiro valor :");
valor1 = teclado.nextInt();

//System.out.println("Por favor, digite o segundo valor :");
valor2 = teclado.nextInt();

resultado = valor1 + valor2 ;
System.out.println("SOMA = " + resultado);



}
}