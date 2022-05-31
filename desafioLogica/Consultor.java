package desafioLogica;

public class Consultor extends Funcionario{

	private double valorHora;
	private long horasTrabalhadas;
	
	public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
		super(nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public long getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(long horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double calcularSalario() {
		return getValorHora() * getHorasTrabalhadas();
	}
}
