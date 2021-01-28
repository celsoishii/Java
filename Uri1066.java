import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

float valor;
int qtde=0;
int par=0;
int impar=0;
int positivo=0;
int negativo=0;

for (int i=1; i<=5; i++){
    valor = teclado.nextFloat();
    
    if (valor%2==0){
        par++;
    }
    else {
        impar++;
    }
    if (valor>0){
        positivo++;
    }
    else if (valor <0){
        negativo++;
    }

}

System.out.println(par+ " valor(es) par(es)");
System.out.println(impar+ " valor(es) impar(es)");
System.out.println(positivo+ " valor(es) positivo(s)");
System.out.println(negativo+ " valor(es) negativo(s)");


    }
}