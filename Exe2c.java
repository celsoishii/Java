import java.util.Scanner;

public class Exe2c{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

float b;
float h;
float a;

System.out.println("Por favor, digite um valor da base do triangulo");
b = teclado.nextFloat();

System.out.println("Por favor, digite um valor da altura do triangulo");
h = teclado.nextFloat();

a = b*h/2;
System.out.println("O valor da area do triangulo = " + a);

}
}