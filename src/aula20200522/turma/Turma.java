package aula20200522.turmas;

public class Turma {
	private String codigo;
	private Aluno lider;
	private list<Aluno> alunos;
	
	public Turma(String codigo) {
		this.codigo = codigo;
		alunos = new list<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public lista<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setLider(Aluno lider) {
		this.lider = lider;
	}
	
	public Aluno getLider() {
		return lider;
	}
}
