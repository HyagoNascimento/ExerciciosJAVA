package Atividade03;
import java.util.Locale;
import java.util.Scanner;
public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		double velocidadeRua,velocidadeCarro,multa;
		
		System.out.println("Informe a velocidade de um carro: ");
		velocidadeCarro =  ler.nextDouble();
		System.out.println("Informe a velocidade máxima para a rua: ");
		velocidadeRua =  ler.nextDouble();
		
		if((velocidadeCarro-velocidadeRua)>0){		
				if((velocidadeCarro-velocidadeRua)<=10) {	System.out.println("Multa no valor de 50,00R$");}
			else if((velocidadeCarro-velocidadeRua)<=30)	{ System.out.println("Multa no valor de 100,00R$");}
			else if((velocidadeCarro-velocidadeRua)=>31){ System.out.println("Multa no valor de 300,00R$");}
	}	else {
		System.out.println("Você está dentro do limete de velocidade");}
	}}
