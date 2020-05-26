package aula20200522.forum;

import java.util.ArrayList;

public class Pais {

	public String nome;
	public int codDdd;
	public ArrayList<Estado> estados = new ArrayList<>();
	
	public Pais(String nome, int codDdd) {
		this.nome = nome;
		this.codDdd = codDdd;
	}

	public String getNome() {
		return nome;
	}

	public int codDdd() {
		return codDdd;
	}
	
	public void addEstado(Estado e) {
		this.estados.add(e);
	}
	
	public ArrayList<Estado> getEstados(){
		return this.estados;
	}

	public int contEstado() {
		return estados.size();
	}
}
