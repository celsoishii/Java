import java.util.Scanner;

public class Uri1051{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

double renda;
double imposto;

//Entrada
renda = teclado.nextDouble();

//Testes
if (renda <=2000.00) {
    System.out.println("Isento"); 
    imposto = 0;
}
else if (renda > 2000.00 && renda <= 3000.00 ) {
    imposto = (renda - 2000.00)*0.08;
    System.out.printf("R$ %.2f\n",imposto);
}
else if (renda > 3000.00 && renda <= 4500.00 ) {
    imposto = (3000.00-2000.00)*0.08 + (renda - 3000.00)*0.18;
    System.out.printf("R$ %.2f\n",imposto);
}

else   {
    imposto = (3000.00-2000.00)*0.08 + (4500.00 - 3000.00)*0.18 + (renda-4500.00)*0.28;
    System.out.printf("R$ %.2f\n",imposto);
}




    }
}