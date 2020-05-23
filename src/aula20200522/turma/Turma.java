package aula20200522.turmas;
import java.util.HashSet;

public class Turma {
	private String codigo;
	private Aluno lider;
	private HashSet<Aluno> alunos;
	
	public Turma(String codigo) {
		this.codigo = codigo;
		alunos = new HashSet<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public HashSet<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setLider(Aluno lider) {
		this.lider = lider;
	}
	
	public Aluno getLider() {
		return lider;
	}
}
