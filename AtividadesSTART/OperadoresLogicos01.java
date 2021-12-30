import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe o valor do salario : ");
	float salario = teclado.nextFloat();
	if (salario<2000) {
		System.out.println("Sem Taxa");
	}	
	else if ((salario>2000) || (salario<=3000)) { 
		System.out.println("Taxa de 8%");
		float salarioTotal = (salario/100)*8;	
		System.out.println("Valor do Imposto é: R$" + salarioTotal);
	}
	else if ((salario>3000.1) || (salario>=4500.1)){ 
		System.out.println("Taxa de 18%");
		float salarioTotal = (salario/100)*18;	
		System.out.println("Valor do Imposto é: R$ " + salarioTotal);
	}
	else if (salario<4500){ 
		System.out.println("Taxa de 28%");
		float salarioTotal = (salario/100)*28;	
		System.out.println("Valor do Imposto é: R$" + salarioTotal);
	}
	}
}
