package forum20200612.associacaoBidirecional;

import java.util.ArrayList;
import java.util.Collection;

public class Turma {

    private String nome;
    private Collection<Aluno> alunos;

    public Turma(String nome, Collection<Aluno> alunos) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        /* Verifica se o Aluno já está no array Alunos, caso não ele adiciona 
         e tambem adiciona o nome do aluno na classe turma*/
        for (Aluno a : alunos) {
            if (!this.alunos.contains(a)) {
                this.alunos.add(a);
                a.addTurma(this);
            } else {
                System.out.println("o " + a + ", já está matriculado em uma turma");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Collection<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma: " + nome;
    }

}
