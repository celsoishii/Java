import java.util.Scanner;
public class Uri1165{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int vezes;
int valor;
int teste;

//entrada 1
    vezes = teclado.nextInt();

//interação 1
for (int j=1; j<=vezes;j++){

//entrada n
    valor= teclado.nextInt();

//iteração 2
teste=0;
for (int i=1; i<=valor; i++){
   
        if (valor%i==0){
            teste++;
        }
}
        if (teste<3){
            System.out.println(valor+" eh primo");
        }
        else { 
            System.out.println(valor+" nao eh primo");
        }
    
}    
  



    }
}