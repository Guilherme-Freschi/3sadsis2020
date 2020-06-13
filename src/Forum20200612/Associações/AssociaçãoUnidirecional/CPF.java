package forum20200612.associacaoUnidirecional;

public class CPF {
	private Pessoa pessoa;

	public CPF(Pessoa pessoa){
            if (pessoa == null) {
                throw new RuntimeException("Cpf obrigatorio!");
            }
		this.pessoa = pessoa;
		this.pessoa.setCpf(this);
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}

}
