//4 – Pensei em fazer solicitando ao cliente que informasse o código do produto (usando condicionais), mas sairia do que pedia na questão, então fiz dessa forma.
//Pedi para que o usuário informasse o valores e unidades para que o cálculo, de acordo com a formula, fosse realizado.
public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int unidade,unidade2;
		float valor,valor2,total,IPI;
		System.out.println("Informe o valor de IPI: ");
		IPI=  ler.nextFloat();
		
		System.out.println("Informe o valor do produto cod 01: ");
		valor=  ler.nextFloat();
		System.out.println("Informe o valor do produto cod 02: ");
		valor2=  ler.nextInt();
		
		System.out.println("Informe a quantidade: ");
		unidade=  ler.nextInt();
		System.out.println("Informe a quantidade do produto 02: ");
		unidade2=  ler.nextInt();
		
		total=(valor*unidade + valor2*unidade2)*(IPI/100 + 1);
		System.out.println("Valor a pagar"+total);	
	}
}
