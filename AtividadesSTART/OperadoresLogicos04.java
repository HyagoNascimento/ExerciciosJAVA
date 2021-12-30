import java.util.Locale;
	import java.util.Scanner;
	public class OperadoresLogicos 
		public static void main(String[] args) {	
			int  cont,valor; 
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.ENGLISH);
			
		System.out.println("Informe o Valor: ");
		valor = ler.nextInt();	
		
		if (1<= valor && valor <=1000){ 
			for(cont = 1; cont <= valor; cont++) {
			if((cont % 2) != 0) {
			System.out.println("os valores impares são " + cont);
		}
		}
		}
		else {
			System.out.print("Número Inválido!!");
		}
		}
	}
