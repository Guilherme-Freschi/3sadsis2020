package aula20200522.turmas;

public class AppTurma {
	public static void main(String[] args) {
		Aluno leandro = new Aluno("Lenadro F.", "1958547-5");
		Aluno gustavo = new Aluno("Gustavo Campos", "198274-4");
		Aluno almeida = new Aluno("Almeida", "1944945-2");
		
		
		Turma turma = new Turma("ADSIS");
		turma.adicionarAluno(leandro);
		turma.adicionarAluno(gustavo);
		turma.setLider(almeida);
		
		for (Aluno aluno : turma.getAlunos()) {
			System.out.println(aluno);
		}
		
		System.out.println(turma.getLider());
		
		
		
		
	}

}
