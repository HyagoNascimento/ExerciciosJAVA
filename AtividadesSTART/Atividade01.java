public class atividade02_q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		int senha,numero;
		
		System.out.println("Número de telefone sem o DDD: ");
		numero =  ler.nextInt();
		System.out.println("Senha: ");
		senha =  ler.nextInt();
		
		if ((senha != 123456) && (numero != 985464584)) {
		System.out.print("Senha Inválida. Tente novamente!");
		while (senha != 123456) {
		System.out.println("\nNúmero de telefone sem o DDD:");
		numero =  ler.nextInt();
		System.out.println("\nSenha: ");
		senha =  ler.nextInt();
		if ((senha == 123456) && (numero == 985464584)) {
		 System.out.print("\n Seja Bem-Vindo(a)");
			}
				else{
	System.out.print("\nSenha Inválida. Tente novamente!");
				}
			}
		}
		else { System.out.print("Seja Bem-Vindo(a)");
		}
	}
}
