package ar.edu.unlam.pb2.circulo;

public class Circulo {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;

	
	public Circulo(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	public Double calcularRadioInterior(Double circuloMenor) {
		radioInterior = circuloMenor / 2;
		return radioInterior;
	}
	
	public Double calcularRadioExterior (Double circuloMayor) {
		radioExterior = circuloMayor / 2;
		return radioExterior;
	}
	
	public Double calcularPerimetroInterior () {
		perimetroInterior = (Math.PI * 2 * this.radioInterior);
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior() {
		perimetroExterior = (Math.PI * 2 * this.radioExterior);
		return perimetroExterior;
	}
	
	public Double calcularSuperficie() {
		superficie = Math.PI * (Math.pow(this.radioExterior, 2) - Math.pow(this.radioInterior, 2));
		return superficie;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
}
