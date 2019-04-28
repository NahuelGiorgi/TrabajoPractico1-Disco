package ar.edu.unlam.pb2.circulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void testQueDeTodosLosDatos() {
		Circulo circulo1= new Circulo(3.0,5.0);
		
	    Double radioInterior=circulo1.calcularRadioInterior(3.0);
		Double radioExterior=circulo1.calcularRadioExterior(5.0);
		Double perimetroInterior=circulo1.calcularPerimetroInterior();
		Double perimetroExterior=circulo1.calcularPerimetroExterior();
		Double superficieTotal=circulo1.calcularSuperficie();
		
		assertEquals(9.424777961,perimetroInterior,0.001);
		assertEquals(15.70796327 , perimetroExterior , 0.001);
		assertEquals(12.5663706144, superficieTotal , 0.001);
		assertEquals(1.500,radioInterior , 0.01);
		assertEquals(2.500, radioExterior , 0.01);
		

		}
	}


