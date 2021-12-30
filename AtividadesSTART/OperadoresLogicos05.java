  import java.util.Locale;
	import java.util.Scanner;
	public class OperadoresLogicos {
	
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.ENGLISH);
			
			int cont, soma,valorA, valorB, valorC;
			
			System.out.println("Informe o valor  de X: ");
			valorA =  ler.nextInt();
			
			System.out.println("Informe o valor  de Y:  ");
			valorB =  ler.nextInt();
			
			if(valorB < valorA) {
			valorC = valorA;
			valorA = valorB;
			valorB = valorC;
			}
			soma = 0;
			for (cont = (valorB + 1) ; cont < valorB ; cont++) {
			if (cont % 2 != 0) {
			cont++;
			soma += cont++;
				}
			}
			System.out.println("a soma dos valores impares é: " + soma);
		}}
