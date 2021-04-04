package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC () {
		super("Cúbica de Face Centrada");	
	}
	
	@Override
	public double calcula(double pesoAtomico, double raioAtomico) {
		double numeroAvogrado = 6.023 * Math.pow(10, 23);
		
		double raioCentimetro = raioAtomico/10000000;
		
		double volumeUnitario = Math.pow((4*raioCentimetro) / Math.pow(2,0.5), 3);
		
		double densidade = (4*pesoAtomico) / (numeroAvogrado*volumeUnitario);
		
		return densidade;
	}
}
