package aula20200525.forum;

public class Estado {
	
	public String nome;
	public int codDDD;
	public String sigla;
	
	public Estado(String nome, String sigla, int codDDD) {
		this.nome = nome;
		this.sigla = sigla;
		this.codDDD = codDDD;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public int getCodDDD() {
		return codDDD;
	}	
	
}
