import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
float valor;
int qtde=0;

//entrada
valor = teclado.nextFloat();

for (int i=1; i<=valor; i++){
        
    if (i%2!=0){
       System.out.println(i);
    }
   
}


    }
}