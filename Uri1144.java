import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int contador;

//entrada
    contador= teclado.nextInt();

//iteração

for (int i=1; i<=contador; i++){
   
        System.out.println(i+" "+(i*i)+" "+(i*i*i));
        System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));
    }
    
  



    }
}