import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int valor;
//int qtde=0;

//entrada
valor = teclado.nextInt();
if (valor%2==0){
    valor = valor +1;
}

for (int i=1; i<=6; i++){
        
           System.out.println(valor);
    valor = valor + 2;
   
}


    }
}