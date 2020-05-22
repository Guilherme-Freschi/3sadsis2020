package aula20200522.turmas;

public class AppTurma {
	public static void main(String[] args) {
		Aluno matheus = new Aluno("Matheus S.", "1924545-5");
		Aluno gustavo = new Aluno("Gustavo Cesar", "5481284-4");
		Aluno luan = new Aluno("Luan", "4544845-5");
		
		
		Turma turma = new Turma("ADSIS2");
		turma.adicionarAluno(luan);
		turma.adicionarAluno(matheus);
		turma.setLider(gustavo);
		
		for (Aluno aluno : turma.getAlunos()) {
			System.out.println(aluno);
		}
		
		System.out.println(turma.getLider());
		
		
		
		
	}

}
