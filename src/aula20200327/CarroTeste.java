package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroTeste {

	@Test
	void ligarCarroEAcelerarComCombustivel() {
		Carro carro = new Carro();
		
		carro.abastecer(2);
		
		carro.ligar();
		carro.acelerar();
		
		assertEquals(true, carro.isLigado());
		assertEquals(false, carro.isDesligado());
		assertEquals(1.5, carro.gasolinaTanqueLitros);
	}

	@Test
	void NaoLigarCarroSemCombustivel() {
		Carro carro = new Carro();
		
		carro.abastecer(0.2);
		carro.ligar();
		
		assertEquals(false, carro.isLigado());
		assertEquals(true, carro.isDesligado());
	}
	
	@Test
	void desligarCarroSemCombustivel() {
		Carro carro = new Carro();
		
		carro.abastecer(2.2);
		carro.ligar();
		for (int i = 0; i <= 7; i++) {
			carro.acelerar();
		}
		
		assertEquals(true, carro.isLigado());
		assertEquals(false, carro.isDesligado());
	}
	
	
	
	
}
