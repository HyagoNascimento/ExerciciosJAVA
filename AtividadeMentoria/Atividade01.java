//1 – Solicitei que o usuário informe a idade. Seguindo as informações passadas, os anos foram multiplicados por 12(meses de 1 ano) 
//e os dias foram multiplicados por 365(dias de 1 ano).
package Atividade_Mentoria;

import java.util.Locale;
import java.util.Scanner;

public class Atividad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade,DD,MM,AAAA;
		
		System.out.println("Informe a sua idade: ");
		idade =  ler.nextInt();
	AAAA=idade;
	MM=idade*12;
	DD=idade*365;
	
	System.out.println( idade + "anos," + MM + "meses e "+ DD + " dias");
	}
}
