package forum20200612.associacaoBidirecional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Victor Almeida");
        Aluno aluno2 = new Aluno("Lucas Barbosa");
        Aluno aluno3 = new Aluno("Mario Soares");

        List lista1 = new ArrayList();
        lista1.add(aluno1);
        lista1.add(aluno2);

        Turma turma1 = new Turma("2°", lista1);

        List lista2 = new ArrayList();
        lista2.add(aluno1);
        lista2.add(aluno3);
        Turma turma2 = new Turma("3°", lista2);

        System.out.println("Alunos 2°");
        System.out.println(turma1.getAlunos());
        System.out.println("");
        System.out.println("Alunos 3°");
        System.out.println(turma2.getAlunos());

    }

}
