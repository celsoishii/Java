import java.util.Scanner;

public class Uri1048{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

double salary;
int porcentagem;
double newsalary;
double ganho;


//Entrada
salary = teclado.nextDouble();

//Testes
if (salary <= 400.00) {
    porcentagem = 15;
}
else if (salary > 400.00 && salary<=800.00) {
    porcentagem = 12;
}
else if (salary > 800.00 && salary<=1200.00) {
    porcentagem = 10;
}
else if (salary > 1200.00 && salary<=2000.00) {
    porcentagem = 7;
}
else { 
    porcentagem = 4;}

//calculo

ganho=salary*porcentagem/100;
newsalary=salary+ganho;

//saida

System.out.printf("Novo salario: %.2f\n",newsalary) ;
System.out.printf("Reajuste ganho: %.2f\n",ganho) ;
System.out.println("Em percentual: "+porcentagem+" %") ;


    }
}