package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{

	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrada");
	}
	
	
	@Override
	public double calcula(double pesoAtomico, double raioAtomico) {
		double numeroAvogadro = 6.023 * Math.pow(10, 23);
		
		double raioCentimetro = raioAtomico / 10000000;
		
		double volumeUnitario = Math.pow((4*raioCentimetro) / Math.pow(3, 0.5), 3); 
		
		double densidade = (2*pesoAtomico) / (numeroAvogadro*volumeUnitario);
		
		return densidade;
	}
}
