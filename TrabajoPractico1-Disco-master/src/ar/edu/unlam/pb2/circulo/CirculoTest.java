package ar.edu.unlam.pb2.circulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void testQue() {
		Circulo circulo1= new Circulo(5.0,3.0);
		
		Double perimetro1= circulo1.calcularPerimetroExterior();
		Double perimetro2= circulo1.calcularPerimetroInterior();
		Double superficieTotal=circulo1.calcularSuperficie();
		circulo1.calcularPerimetroInterior();
		circulo1.calcularSuperficie();
		
		
		assertEquals(15.70796327,perimetro1,0.001);
		assertEquals(9.424777961 , perimetro2 , 0.001);
		assertEquals(25.13274123, superficieTotal , 0.001);
		
		}
	}


