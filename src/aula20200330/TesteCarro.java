package aula20200330.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComCarro {
	
	@Test
	void testarConsumo() {
		Carro civcGRZ1311 = new Carro(0);
		Carro palioRGH9772 = new Carro(0);

		palioRGH9772.abastecer(15.00);
		palioRGH9772.ligar();
		assertEquals(14.75, palioRGH9772.getgasolinaTanqueLitros());

		palioRGH9772.acelerar();
		palioRGH9772.acelerar();
		palioRGH9772.acelerar();
		assertEquals(14, palioRGH9772.getgasolinaTanqueLitros());

		civcGRZ1311.abastecer(1.00);
		civcGRZ1311.ligar();
		assertEquals(0.750, civcGRZ1311.getgasolinaTanqueLitros());

		civcGRZ1311.acelerar();
		assertEquals(0.500, civcGRZ1311.getgasolinaTanqueLitros());

	}

	// 2. O Carro se desligue automaticamente sempre que o combustível
	// no tanque seja insuficiente para seu funcionamento.
	@Test
	void testeAcabandoCombustivel() {
		Carro foxGAS8756 = new Carro(0);
		foxGAS8756.abastecer(1.25);
		foxGAS8756.ligar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		assertEquals(false, foxGAS8756.isDesligado());

		Carro unoTOP1234 = new Carro(0);
		toroUPY1734.abastecer(1.00);
		toroUPY1734ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		assertEquals(false, toroUPY1734.isDesligado());
	}
	// 3. O Casso possa ser reabastecido.

	@Test
	void carroSendoReabastecido() {
		Carro hiluxLEK6576 = new Carro(0);
		Carro meriva = new Carro(0);
		
		hiluxLEK6576.abastecer(5.00);
		assertEquals(5,hiluxLEK6576.getgasolinaTanqueLitros());
		
		meriva.abastecer(8.00);
		assertEquals(8,meriva.getgasolinaTanqueLitros());
		
		hiluxLEK6576.ligar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.desligar();
		hiluxLEK6576.abastecer(10);
		assertEquals(14,hiluxLEK6576.getgasolinaTanqueLitros());
		
		meriva.ligar();
		meriva.acelerar();
		meriva.desligar();
		meriva.abastecer(20);
		assertEquals(27.5,meriva.getgasolinaTanqueLitros());
	}

	//4. O Carro possa ser criado com uma quantidade determinada de combustível (via construtor).
	@Test
	void combustivelComConstruct() {
		Carro fuscaOPA6787 = new Carro(15);
		assertEquals(15,fuscaOPA6787.getgasolinaTanqueLitros());
	
		fuscaOPA6787.ligar();
		fuscaOPA6787.acelerar();
		fuscaOPA6787.desligar();
		fuscaOPA6787.abastecer(15);
		assertEquals(29.5,fuscaOPA6787.getgasolinaTanqueLitros());
		
		Carro golKLK0978 =  new Carro(22);
		assertEquals(22,goloKLK0978.getgasolinaTanqueLitros());
		
		golKLK0978.ligar();
		golKLK0978.acelerar();
		golKLK0978.acelerar();
		golKLK0978.acelerar();
		golKLK0978.desligar();
		golKLK0978.abastecer(9);
		assertEquals(30,golKLK0978.getCombustivelNoTanqueEmLitros());
		
		
	}
	
	
}mport static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComCarro {

	// 1. O Carro consuma 250ml de combustível sempre que for ligado ou acelerado.
	@Test
	void testarConsumo() {
		Carro civcGRZ1311 = new Carro(0);
		palioRGH9772 = new Carro(0);

		palioRGH9772.abastecer(15.00);
		palioRGH9772.ligar();
		assertEquals(14.75, palioRGH9772.getgasolinaTanqueLitros());

		palioRGH9772.acelerar();
		palioRGH9772.acelerar();
		palioRGH9772.acelerar();
		assertEquals(14, palioRGH9772.getgasolinaTanqueLitros());

		civcGRZ1311.abastecer(1.00);
		civcGRZ1311.ligar();
		assertEquals(0.750, civcGRZ1311.getgasolinaTanqueLitros());

		golfRPZ1341.acelerar();
		assertEquals(0.500, civcGRZ1311.getgasolinaTanqueLitros());

	}

	// 2. O Carro se desligue automaticamente sempre que o combustível
	// no tanque seja insuficiente para seu funcionamento.
	@Test
	void testeAcabandoCombustivel() {
		foxGAS8756 = new Carro(0);
		foxGAS8756.abastecer(1.25);
		foxGAS8756.ligar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		foxGAS8756.acelerar();
		assertEquals(false, foxGAS8756.isDesligado());

		Carro toroUPY1734 = new Carro(0);
		toroUPY1734.abastecer(1.00);
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		toroUPY1734.ligar();
		toroUPY1734.desligar();
		assertEquals(false, toroUPY1734.isDesligado());
	}
	// 3. O Casso possa ser reabastecido.

	@Test
	void carroSendoReabastecido() {
		Carro hiluxLEK6576 = new Carro(0);
		Carro meriva = new Carro(0);
		
		hiluxLEK6576.abastecer(5.00);
		assertEquals(5,hiluxLEK6576.getgasolinaTanqueLitros());
		
		meriva.abastecer(8.00);
		assertEquals(8,meriva.getgasolinaTanqueLitros());
		
		hiluxLEK6576.ligar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.desligar();
		hiluxLEK6576.abastecer(10);
		assertEquals(14,hiluxLEK6576.getgasolinaTanqueLitros());
		
		meriva.ligar();
		meriva.acelerar();
		meriva.desligar();
		meriva.abastecer(20);
		assertEquals(27.5,meriva.getgasolinaTanqueLitros());
	}

	//4. O Carro possa ser criado com uma quantidade determinada de combustível (via construtor).
	@Test
	void combustivelComConstruct() {
		Carro fuscaUTA6787 = new Carro(15);
		assertEquals(15,fuscaUTA6787.getgasolinaTanqueLitros());
	
		fuscaUTA6787.ligar();
		fuscaUTA6787.acelerar();
		fuscaUTA6787.desligar();
		fuscaUTA6787.abastecer(15);
		assertEquals(29.5,fuscaUTA6787.getgasolinaTanqueLitros());
		
		Carro golKLK0978 =  new Carro(22);
		assertEquals(22,audiKLK0978.getgasolinaTanqueLitros());
		
		golKLK0978.ligar();
		golKLK0978.acelerar();
		golKLK0978.acelerar();
		golKLK0978.acelerar();
		golKLK0978.desligar();
		golKLK0978.abastecer(9);
		assertEquals(30,golKLK0978.getgasolinaTanqueLitros());
		
	@Test
	void esvaziarTanqueDeCombustivel() {
		Carro fuscaUTA6787 = new Carro(15);
		
		fuscaUTA6787.setEsvaziarCombustivelNoTanque();
		
		assertEquals(0),fuscaUTA6787 .getgasolinaTanqueLitros());
		
		
	}
}

