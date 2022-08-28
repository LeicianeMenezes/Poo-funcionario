package entidade;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiq() {
		return salarioBruto - imposto;
	}
	
	public void AumentarSalario(double porcentagem) {
		salarioBruto = salarioBruto + (salarioBruto * porcentagem / 100.0);
		
	}
	@Override
    public String toString (){
    	return nome +", $ " + String.format("%.2f", salarioLiq());
    }
	
}
