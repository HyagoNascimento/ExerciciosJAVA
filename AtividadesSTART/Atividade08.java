package exerciciorepita;

import java.util.Locale;
import java.util.Scanner;


public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner(System.in);
	
	int n;
	int s = 0;
	
	System.out.print("(Insira '0' para finalizar)");

		do {
			System.out.print("Informe um número: ");
			n =  ler.nextInt();
		 s += n;
		} while ( n != 0);
		System.out.print("Resultado final ----" + "Somatorio dos valores = " + s);
	}

}
