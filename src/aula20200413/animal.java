package aula20200413;

public class animal {
	private String nome;
	private int vacinacao;
	private String raca;
	private int idade;
	
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
	}
	
	// 2.3 Um método modificador;
	public void setIdade(int idade) {
		if (idade < 0) {
			throw new RuntimeException("Idade deve ser Maior que 0");
		}
		this.idade = idade;

	}
	
	
	// 2.4 e 2.5
	//Um método de acesso cujo retorno NÂO seja o valor de um atributo, mas sim 
	//um valor CALCULADO em função de um valor de atributo.;
	private int calcularDataVacinacao() {
	  if(this.vacinacao <= 2020) {
            throw new RuntimeException("Vacinação vencida ou inválida ");
           }
	  return calcularDataVacinacao();
	} 
	
}

	
	
