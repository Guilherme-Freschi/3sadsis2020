package aula20200330.carro;

public class Carro {

	private double  gasolinaTanqueLitros = 0.00;
	private boolean ligado = false;

	public void carro() {

		if ( gasolinaTanqueLitros < 0.250) {
			this.ligado = false;
		}

	}

	public void abastecer(double volumeEmLitros) {
		 gasolinaTanqueLitros += volumeEmLitros;
	}

	public void ligar() {
		if ( gasolinaTanqueLitros >= 0.250) {
			this.c gasolinaTanqueLitros -= 0.250;
			this.ligado = true;
		}
	}

	public void desligar() {
		this.ligado = false;
	}

	public void acelerar() {
		if (ligado == true) {
			if ( gasolinaTanqueLitros >= 0.250) {
				 gasolinaTanqueLitros -= 0.250;
			} else
				this.ligado = false;
		}

	}

	public boolean isLigado() {
		return this.ligado;
	}

	public boolean isDesligado() {
		return this.ligado;
	}

	public double getgasolinaTanqueLitros() {
		return  gasolinaTanqueLitros;
	}

	public Carro(double gasolinaTanqueLitros) {
		this. gasolinaTanqueLitros = gasolinaTanqueLitros;
	}

	

}
