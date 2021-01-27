import java.util.Scanner;

public class Uri1020{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// variaveis
int diastotais;
int anos;
int meses;
int dias;

// entradas

diastotais = teclado.nextInt();

//contas
anos = diastotais/365;
meses = (diastotais%365)/30;
dias = (diastotais%365)%30;
//saida
System.out.println(anos + " ano(s)");
System.out.println(meses + " mes(es)");
System.out.println(dias + " dia(s)");


}
}