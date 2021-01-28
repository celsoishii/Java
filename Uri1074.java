import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
//variaveis
int repetir;
int valor=0;

//entrada
repetir = teclado.nextInt();

//iteracao

for (int i=1; i<=repetir ;i++){
valor = teclado.nextInt();
    if (valor%2==0 && valor!=0){
           System.out.print("EVEN ");
    }
    else if (valor%2==1 || valor%2==-1) {
        System.out.print("ODD ");
    }
    if (valor>0){
           System.out.println("POSITIVE");
    }
    else if (valor<0) {
        System.out.println("NEGATIVE");
    }
    if (valor==0){
        System.out.println("NULL");
    }
}


    }
}