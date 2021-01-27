import java.util.Scanner;

public class Uri1005{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

float valor1;
float valor2;
float resultado;

//System.out.println("Por favor, digite o primeiro valor :");
valor1 = teclado.nextFloat();

//System.out.println("Por favor, digite o segundo valor :");
valor2 = teclado.nextFloat();

resultado = ((valor1*3.5f) + (valor2*7.5f))/11 ;

System.out.printf("MEDIA = %.5f\n",resultado);



}
}