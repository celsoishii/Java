import java.util.Scanner;

public class Uri1046{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

int horaini;
int horafim;
int duracao;

//Entrada
horaini = teclado.nextInt();
horafim = teclado.nextInt();

//Testes
if (horaini < horafim) {
    duracao=horafim-horaini ;
}
else if (horaini == horafim) {
    duracao = 24;
}
else  {
    duracao = (24-horaini)+horafim ;
}

//saida 
System.out.println("O JOGO DUROU "+duracao+" HORA(S)");


    }
}