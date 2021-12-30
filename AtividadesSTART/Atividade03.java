public class atividade02_q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		int valor;
		
		System.out.println("Informe o número: ");
		valor =  ler.nextInt();

		for(int i = 1; i < 11; i++)
		{ System.out.println(valor + "X" + i + " = " + (valor*i) );
			
			};	}}
