import java.util.Scanner;

public class Exe2d{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

float b;
float h;
float a;

System.out.println("Por favor, digite um valor da diagonal 1 do losango");
b = teclado.nextFloat();

System.out.println("Por favor, digite um valor da diagonal 2 do losango");
h = teclado.nextFloat();

a = b*h;
System.out.println("O valor da area do losango  = " + a);

}
}