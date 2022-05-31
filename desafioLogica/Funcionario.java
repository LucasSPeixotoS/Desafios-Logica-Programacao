package desafioLogica;

public abstract class Funcionario {

	private String nome;
	private long cpf;

	public double SALARIO_MINIMO = 1000.0;
	
	public Funcionario(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public void setSALARIO_MINIMO(double sALARIO_MINIMO) {
		SALARIO_MINIMO = sALARIO_MINIMO;
	}

	public abstract double calcularSalario();
	
}
