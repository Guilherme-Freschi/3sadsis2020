package aula20200413;

public class animal {
	private String nome;
	private int vacinacao;
	private String raca;
	private int idade;
	private double peso;
	
	// 2.1 Um construtor padrão;
	public animal() {
		System.out.println("animal");
	}
	
	// 2.2 Um construtor alternativo;
	public animal(String nome, int vacinacao, String raca, int idade, double peso) {
		setNome(nome);
		setVacinacao(vacinacao);
		setRaca(raca);
		setIdade(idade);
		setPeso(peso);
	}
	
	// 2.3 Um método modificador;
	public void setIdade(int idade) {
		if (nota < 0) {
			throw new RuntimeException("Idade deve ser Maior que 0");
		}
		this.nota = nota;

	}
	
	
	// 2.5 Um método de acesso cujo retorno NÂO seja o valor de um atributo, mas sim
	// um valor CALCULADO em função de um valor de atributo.;
	public int getAnoDeLançamento() {
		return calculandoAnoDeLançamento();
	}

	public int getTemporadas() {
		return temporadas;
	}

	public int getNota() {
		return calcularNota();
	}


	public int calculandoAnoDeLançamento() {
		return 2020 - anoDeLançamento;
	}


	public int calcularNota() {
		return 100 - nota;
	}
}


   
  
	private int calcularDataVacinacao() {
          if(this.vacinacao <= 2020) {
            throw new RuntimeException("Vacinação vencida ou inválida ");
           }
  
       }   
	private int calcularIdadegato() {
		if (this.idade <= 0) {
			throw new RuntimeException("Por favor informe a Idade");
		}
		return this.idade*pegarPesogato();
	}

}



	public String toString() {
		return "animal [" + "nome:" + getNome() + ",nota:" + getNota() + " ,temporadas=" + getTemporadas()
				+ ",Serie lançanda a " + getAnoDeLançamento() + " anos]";
	}

	

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLançamento(int anoDeLançamento) {
		this.anoDeLançamento = anoDeLançamento;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	


	public String getNome() {
		return nome;
	}

	
