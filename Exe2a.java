import java.util.Scanner;

public class Exe2a{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

float l;
float a;

System.out.println("Por favor, digite um valor do lado do quadrado");
l = teclado.nextFloat();
a = l*l;
System.out.println("O valor da area quadrado = " + a);

// e se quisse colocar uma restriçao no numero de casas decimais

System.out.printf("O valor da ara do quadro = %.3f\n",a);

}
}

