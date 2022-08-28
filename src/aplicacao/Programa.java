package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func=new Funcionario ();
		
		System.out.println("Digite o nome do Funcionario: ");
		func.nome=sc.nextLine();
		
		System.out.println("Digite o salario Bruto: ");
		func.salarioBruto=sc.nextDouble();
		
		System.out.println("Digite o valor do Imposto: ");
		func.imposto=sc.nextDouble();
		
		System.out.println();
		System.out.printf("Funcionario : "+ func);
		
		System.out.println();
		System.out.println("Digite a porcentagem para aumentar o salario: ");
		double porcentagem=sc.nextDouble();
		func.AumentarSalario(porcentagem);

		System.out.println();
		System.out.println("Dados atualizados: "+func);
		sc.close();
		
	}

}
