//3 – Pedir ao usuário o valor do salário. Em seguida, pus uma variável que faz a soma do valor informado do salário+ o equivalente a 1% do salário.
//Imprimindo na tela os valores somados.
public class Ativiade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float salario,salarioTotal;
		
		System.out.println("Informe o seu salário: ");
		salario=  ler.nextFloat();
		
		salarioTotal=salario+(salario/100);
		System.out.println("Salário com ajuste (1%): "+salarioTotal);
	}
}
