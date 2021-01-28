import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int pum;
int contador;

//entrada
    pum = teclado.nextInt();

//quantidade
    contador = pum*4;

//iteração

for (int i=1; i<=contador; i++){
    if (i%4==0){
        System.out.println("PUM");
    }
    else {
    System.out.print(i+" ");       
       
    }  
  
}


    }
}