import java.util.Scanner;

public class Uri1047v2{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

int horaini;
int horafim;
int durhora;
int minini;
int minfim;
int durmin;
int totalmin;
int totalini;
int totalfim;

//Entrada
horaini = teclado.nextInt();
minini = teclado.nextInt();
horafim = teclado.nextInt();
minfim = teclado.nextInt();

//calculos
totalini = horaini*60+minini;
totalfim = horafim*60+minfim;

//Testes 
if (totalini < totalfim) {
    totalmin = totalfim-totalini;
}
else {
    totalmin = (24*60-totalini)+totalfim;}

//calculo
durhora=totalmin/60;

durmin=totalmin%60;


//saida 
System.out.println("O JOGO DUROU " + durhora + " HORA(S) E " + durmin + " MINUTO(S)");


    }
}