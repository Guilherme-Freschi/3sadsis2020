package aula20200522.turmas;

import java.util.ArrayList;

public class AppMain {

	public static void main(String[] args) {

		Pais brasil = new Pais("Brasil", 55);

		brasil.addEstado(new Estado("São Paulo", "SP", 11));
		brasil.addEstado(new Estado("Paraná", "PR", 44));
		brasil.addEstado(new Estado("Goiás", "GO", 61));

		System.out.println("País: " + brasil.getNome());

		ArrayList<Estado> listaEstados = brasil.getEstados();
		
		for (Estado item : listaEstados) {
			System.out.println("#----------------------#");
			System.out.println(item.getNome());
		}
		
		System.out.println("Quantidade de estados: " + brasil.contarEstado());
	}

}
