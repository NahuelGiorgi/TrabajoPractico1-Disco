package ar.edu.unlam.pb2.circulo;

public class Circulo {
	private Integer radioInterior;
	private Integer radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;

	public Circulo(Integer radioInterior, Integer radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	public Integer calcularRadioInterior(Integer circuloMenor) {
		radioInterior = circuloMenor / 2;
		return radioInterior;
	}
	
	public Integer calcularRadioExterior (Integer circuloMayor) {
		radioExterior = circuloMayor / 2;
		return radioExterior;
	}
	
	public Double calcularPerimetroInterior () {
		perimetroInterior = Math.PI * 2 * this.radioInterior;
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior() {
		perimetroExterior = Math.PI * 2 * this.radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularSuperficie() {
		superficie = Math.PI * (Math.pow(this.radioExterior, 2) - Math.pow(this.radioInterior, 2));
		return superficie;
	}

	public Integer getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Integer radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Integer getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Integer radioExterior) {
		this.radioExterior = radioExterior;
	}
}
