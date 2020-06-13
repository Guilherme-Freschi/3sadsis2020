package forum20200612.associacaoBidirecional;

public class Aluno {

    private String nome;
    private Turma turma;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void addTurma(Turma turma) {
        if (this.turma == null) {
            this.setTurma(turma);
        } else {

            System.out.println("Aluno " + getNome() + ", Já está matricula em uma turma");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String toString() {
        return "Aluno: " + nome + ", " + getTurma();
    }
}
