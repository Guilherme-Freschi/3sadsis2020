package aula20200327.carro;

public class Carro {

	public double gasolinaTanqueLitros;
	private boolean ligado;

	public Carro() {
		gasolinaTanqueLitros = 0;
		ligado = false;
	}

	public void abastecer(double volEmLitros) {
		gasolinaTanqueLitros = volEmLitros;
	}

	public void ligar() {
		if (gasolinaTanqueLitros >= 0.250) {
			ligado = true;
			gasolinaTanqueLitros -= 0.250;
		}
	}

	public void desligar() {
		ligado = false;
	}

	public void acelerar() {
		// carro ligado combustível maior ou igual a 250ml
		if (ligado == true && gasolinaTanqueLitros >= 0.250) {
			gasolinaTanqueLitros -= 0.250;
		}
		if (gasolinaTanqueLitros > 0) 
			ligado = true;	
		else
			ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isDesligado() {
		return !ligado;
	}
}
