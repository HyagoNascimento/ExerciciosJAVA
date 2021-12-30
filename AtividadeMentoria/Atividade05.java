//5 – Pedi o a informação do salário do cliente e fiz um cálculo simples, dividindo o salário pelo salário mínimo.
public class Atividade05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float salario,salarioTotal;
		System.out.println("Informe o seu salário: ");
		salario=  ler.nextFloat();
		salarioTotal=salario/1100;
		System.out.printf("%.2f",salarioTotal);System.out.println(	"SM =R$"+salario);
	}}
6 – Pedi o número, e subtrai 1 para o antecessor e somei 1 para o sucessor.
public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("Informe um número: ");
		n =  ler.nextInt();
		
		System.out.println(	"Antecessor de "+n +"=" + (n-1));
		System.out.println(	"Sucessor de "+n +"=" + (n+1));
	}}
