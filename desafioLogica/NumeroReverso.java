package desafioLogica;

import java.util.Scanner;

public class NumeroReverso {

	public static void numeroReverso() {
		
		Scanner entrada = new Scanner(System.in);
		StringBuilder reverter;
		
		while(true) {
			
			System.out.println("Informe um número inteiro e positivo (deverá conter 4 dígitos): ");
			
			int numeroInformado = entrada.nextInt();
			String mudarParaString = String.valueOf(numeroInformado);
			
			if(numeroInformado >= 1000 && numeroInformado <= 9999) {
				
				
				reverter = new StringBuilder(mudarParaString);
				
				System.out.println(reverter.reverse());
				break;
			} else if(numeroInformado < 1000 || numeroInformado > 9999) {
				System.out.println("O número informado deverá conter 4 dígitos sendo o primeiro dígito maior que 0.");
			}
		}
		
		entrada.close();
		
	}
	
}
