import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int valor;

//entrada
valor = teclado.nextInt();
if (valor%2!=0){
    valor = valor -1;
}

for (int i=2; i<=valor; i+=2){
        
           System.out.println(i+"^2 = " +(i*i));
  
}


    }
}