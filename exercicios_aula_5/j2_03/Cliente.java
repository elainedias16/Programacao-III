package j2_03;

//import java.util.Scanner;

class Cliente {
	String name;
	String CPF;
	
	//static {
		//name = scan.nextLine(); 
		//scan.close();
		//}
		
	public String getName() {
		return name;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		if(verificarCPF(CPF) == true) this.CPF = CPF;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printCliente() {
		System.out.printf(this.name + " " );
		if(verificarCPF(this.CPF) == true) {
			System.out.println(this.CPF);
		}
	}
	
	@SuppressWarnings("unused")
	private static boolean verificarCPF(String cpf) {
		
		if (cpf == null || cpf.length() == 0) return false;
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < cpf.length(); i++) {
			char c = cpf.charAt(i);
			if (c >= '0' && c <= '9') builder.append(c);
		}
	
		if (builder.length() != 11) return false;
		int digito = calcularDigitoVerificador(builder, 9);
		if (digito != builder.charAt(9) - '0') return false;
		digito = calcularDigitoVerificador(builder, 10);
		if (digito != builder.charAt(10) - '0') return false;
		
		return true;
	}
	
	private static int calcularDigitoVerificador(StringBuilder builder, int indice) {
		int soma = 0, peso = indice + 1, digito;
		for (int i = 0; i < indice; i++, peso--) {
		digito = builder.charAt(i) - '0';
		soma += digito * peso;
		}
		digito = 11 - (soma % 11);
		if (digito > 9) digito = 0;
		return digito;
		}
	
	
}
