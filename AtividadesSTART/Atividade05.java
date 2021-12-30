package Atividade03;
import java.util.Locale;
import java.util.Scanner;
public class Atividade01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		double a,b,c;
		
		System.out.println("Informe o primeiro número fracionários: ");
		a =  ler.nextDouble();
		System.out.println("Informe o segundo número fracionários: ");
		b =  ler.nextDouble();
		System.out.println("Informe o terceiro número fracionários: ");
		c =  ler.nextDouble();
		
		if((c+b)<a){System.out.println("O primeiro número é maior que a soma dos dois últimos.");
		}else {		System.out.println("O primeiro número NÃO é maior que a soma dos dois últimos.");}
	}
}
