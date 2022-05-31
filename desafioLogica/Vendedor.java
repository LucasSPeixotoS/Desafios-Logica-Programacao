package desafioLogica;

public class Vendedor extends Funcionario{

	public double comissao;
	public long numeroVendas;
	
	public Vendedor(String nome, long cpf, double comissao, long numeroVendas ) {
		super(nome, cpf);
		this.comissao = comissao;
		this.numeroVendas = numeroVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public long getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(long numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	public double calcularSalario() {
		
		return super.getSALARIO_MINIMO() + (getComissao() * getNumeroVendas());
	}
	
}
