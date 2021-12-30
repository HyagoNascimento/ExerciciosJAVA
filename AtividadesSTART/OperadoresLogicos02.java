public class OperadoresLogicos {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe o Código de área: ");
	int DDD = teclado.nextInt();
	String UF;
	System.out.print("Estado:  ");
	switch (DDD) {
	case 81:
		UF = "Pernanmbuco";
		break;
	case 61:
		UF = "Brasilia";
		break;
	case 71:
		UF = "Salvador";
		break;
	case 11:
		UF = "São Paulo";
		break;
	case 21:
		UF = "Rio de Janeiro";
		break;
	case 32:
		UF = "Juiz de Fora";
		break;
	case 19:
		UF = "Campinas";
		break;
	case 27:
		UF = "Belo Horizonte";
		break;
	default:
		UF= "DDD não encontrado";
		break;
	}System.out.println(UF);
	}
}
