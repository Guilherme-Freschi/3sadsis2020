package aula20200413;

public class animal {
	private String nome;
        private int vacinacao;
	private String raca;
	private int idade;
	private double peso;
    

	
	public animal(String nome, String raca, int idade,double peso) {
		this.nome = nome;
                this.vacinacao = vacinacao;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public animal(String nome, String raca, int idade,double peso) {
		this.nome = nome;
                this.vacinacao = vacinacao;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public void inserirNome(String nome) {
		this.nome = nome;
	}
        public void inserirDataVacinacao{
          this.vacinacao - vacinacao;
        }      
	public void inserirRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return this.nome;
	}
	public String getRaca() {
		return this.raca;
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
