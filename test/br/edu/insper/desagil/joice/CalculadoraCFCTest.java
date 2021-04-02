package br.edu.insper.desagil.joice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.CalculadoraCFC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraCFCTest {
	private CalculadoraCFC calculadoraCFC;
	
	@BeforeEach
	public void setUp() {
		this.calculadoraCFC = new CalculadoraCFC();
		
	}
	
	@Test
	public void ouroTest() {
		double pesoAtomico = 196.97;
		double raioAtomico = 0.144;
		
		assertEquals(19.36, calculadoraCFC.calcula(pesoAtomico, raioAtomico), 0.05);
		
	}
	
	@Test
	public void prataTest() {
		double pesoAtomico = 107.87;
		double raioAtomico = 0.144;
		
		assertEquals(10.60, calculadoraCFC.calcula(pesoAtomico, raioAtomico), 0.05);
		
	}
	
	@Test
	public void cobreTest() {
		double pesoAtomico = 63.55;
		double raioAtomico = 0.128;
		
		assertEquals(8.89, calculadoraCFC.calcula(pesoAtomico, raioAtomico), 0.05);
		
	}
	
}
