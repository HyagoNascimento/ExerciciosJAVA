import java.util.Locale;
import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
		float numero, media, numeroPositivo = 0;
		int  positivo; 
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		positivo = 0;
		
		for(int contador = 1; contador <= 6 ; contador++) {
			System.out.println("Informe um valor: ");
			numero = ler.nextFloat();
			
				if(numero > 0) {
					positivo++;
					numeroPositivo = numeroPositivo + numero;
				}
		}
		
		System.out.printf("Números positvos:  %d", positivo );
		media = numeroPositivo/positivo;
		
		System.out.printf(" O  Valor da média:  %.1f", media );
		
	}
}
