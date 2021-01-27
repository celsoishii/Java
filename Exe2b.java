import java.util.Scanner;

public class Exe2b{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

float b;
float h;
float a;

System.out.println("Por favor, digite um valor da base do retangulo");
b = teclado.nextFloat();

System.out.println("Por favor, digite um valor da altura do retangulo");
h = teclado.nextFloat();

a = b*h;
System.out.println("O valor da area do retangulo= " + a);

}
}