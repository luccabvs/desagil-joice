package br.edu.insper.desagil.joice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.CalculadoraCCC;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraCCCTest {
	private CalculadoraCCC calculadoraCCC;
	
	@BeforeEach 
	public void setUp() {
		this.calculadoraCCC = new CalculadoraCCC();
	}
	
	@Test
	public void niobioTest() {
		double pesoAtomico = 92.91;
		double raioAtomico = 0.143;

		assertEquals(8.57, calculadoraCCC.calcula(pesoAtomico, raioAtomico), 0.05);
	}
	
	@Test
	public void tungstenioTest() {
		double pesoAtomico = 183.84;
		double raioAtomico = 0.137;

		assertEquals(19.28, calculadoraCCC.calcula(pesoAtomico, raioAtomico), 0.05);
	}
	
	@Test
	public void litioTest() {
		double pesoAtomico = 6.94;
		double raioAtomico = 0.152;

		assertEquals(0.53, calculadoraCCC.calcula(pesoAtomico, raioAtomico), 0.05);
	}
}
