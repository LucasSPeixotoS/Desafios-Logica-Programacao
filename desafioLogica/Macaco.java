package desafioLogica;

import java.util.ArrayList;

public class Macaco {

	private String nome;
	private ArrayList <String> bucho = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void comer(String comida) {
		if(bucho.size() < 3) {
			bucho.add(comida);
		} else if(bucho.size() == 3) {
			System.out.println("Bucho cheio!");
		}
		System.out.println(bucho);
	}
	
	public void digerir() {
		if(bucho.isEmpty()) {
			System.out.println("Bucho está vazio!");
		} 
		else {
			bucho.remove(bucho.get(0));
		}
		System.out.println(bucho);
	}
	
	public void verBucho() {
		System.out.println(bucho);
	}

}
