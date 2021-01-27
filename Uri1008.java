import java.util.Scanner;

public class Uri1008{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

int number;
int hours;
double valorhora;
double salary;

//System.out.println("Por favor, digite o primeiro valor :");
number = teclado.nextInt();

//System.out.println("Por favor, digite o segundo valor :");
hours = teclado.nextInt();

//System.out.println("Por favor, digite o segundo valor :");
valorhora = teclado.nextDouble();

salary = valorhora * hours ;

System.out.println("NUMBER = "+number);
System.out.printf("SALARY = U$ %.2f\n",salary);



}
}