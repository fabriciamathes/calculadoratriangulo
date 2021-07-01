package steps;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import common.Driver;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CaculadoraTrianguloPage;

public class CalculadoraTriangulosSteps {
	
	CaculadoraTrianguloPage calculaTriangulo = new CaculadoraTrianguloPage();
	
	@Dado("que acesse a calculadora de triangulos página {string}")
	public void que_acesse_a_calculadora_de_triangulos_pagina(String titulo) {
		Driver.setUrl("https://calculadoratriangulo.herokuapp.com/");
		assertEquals(titulo, calculaTriangulo.getTitulo());
	}

	@Quando("preencho o lado {string}, {string} e {string}")
	public void preencho_o_lado_e(String valor_1, String valor_2, String valor_3) {
		calculaTriangulo.setLados(valor_1, valor_2, valor_3);
	    
	}
		
	@Quando("clico no botão Calcular")
	public void clico_no_bot_o_Calcular() {
		calculaTriangulo.clickCalcular();
	}

	@Entao("devo ter o retorno do tipo de triângulo {string}")
	public void devo_ter_o_retorno_do_tipo_de_tri_ngulo(String mensagem) {
		assertEquals(mensagem, calculaTriangulo.getMesagem());	    
	}
	
	@Entao("devo ter o retorno da mensagem {string}")
	public void devoTerORetornoDaMensagem(String mensagem) {
		assertEquals(mensagem, calculaTriangulo.getMesagem());	
	}
	
}
