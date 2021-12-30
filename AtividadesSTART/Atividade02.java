public class OperadoresLogicos {
	
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.ENGLISH);
			
			double peso,massa,altura;
			 
			
			System.out.println("Informe o peso: ");
			peso =  ler.nextDouble();
			System.out.println("Informe a altura : ");
			altura =  ler.nextDouble();
			
			massa = peso / (altura*altura);
		
			System.out.println("IMC = " + massa);
		}}
