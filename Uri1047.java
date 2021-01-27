import java.util.Scanner;

public class Uri1047{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

//Variaveis

int horaini;
int horafim;
int durhora;
int minini;
int minfim;
int durmin;

//Entrada
horaini = teclado.nextInt();
minini = teclado.nextInt();
horafim = teclado.nextInt();
minfim = teclado.nextInt();

//Teste hora
if (horaini < horafim) {
    durhora=horafim-horaini ;
}
else if (horaini == horafim) {
    durhora = 24;
}
else  {
    durhora = (24-horaini)+horafim ;
}
//teste minutos
if (minini <= minfim) {
    durmin=minfim-minini ;
}
else {
    durmin=(60-minini)+minfim;
    durhora=durhora-1;
}
if (minini < minfim && horaini==horafim){
    durhora=0;
}
//calculo
durmin=durmin%60;

durhora=durhora+durmin/60;


//saida 
System.out.println("O JOGO DUROU " + durhora + " HORA(S) E " + durmin + " MINUTO(S)");


    }
}