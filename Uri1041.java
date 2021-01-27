import java.util.Scanner;

public class Uri1041{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

float x;
float y;


//Entrada
x = teclado.nextFloat();
y = teclado.nextFloat();

//Testes
if (x>0 && y>0) {
    System.out.println("Q1");
}
else if (x<0 && y<0) {
    System.out.println("Q3");
}
else if (x>0 && y<0) {
    System.out.println("Q4");
}
else if (x<0 && y>0) {
    System.out.println("Q2");
}
else if (x==0 && y!=0) {
   ;
}
else if (x!=0 && y==0) {
    System.out.println("Eixo X");
}
else  {
    System.out.println("Origem");
}


    }
}