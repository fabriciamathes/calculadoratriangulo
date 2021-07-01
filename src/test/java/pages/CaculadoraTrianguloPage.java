package pages;


import common.Element;
import enums.ByValue;

public class CaculadoraTrianguloPage {
	
	public Element titulo = new Element(ByValue.CSS, "h2");
	public Element lado1 = new Element(ByValue.ID, "lado1");
	public Element lado2 = new Element(ByValue.ID, "lado2");
	public Element lado3 = new Element(ByValue.ID, "lado3");
	public Element calcular = new Element(ByValue.ID, "calcular");
	public Element mensagem = new Element(ByValue.ID, "message");
	public Element pagina = new Element(ByValue.CSS, "//html");
	

	public String getTitulo() {
		return titulo.getText().trim();
	}
	
	public String getPagina() {
		return pagina.getText().trim();
	}
	
	public String getMesagem() {
		return mensagem.getText().trim();
	}
		
	public CaculadoraTrianguloPage clickCalcular() {
		calcular.click();
		return this;
	}
	
	public CaculadoraTrianguloPage setLados(String value1, String value2, String value3) {
		lado1.clear().sendKeys(value1);
		lado2.clear().sendKeys(value2);
		lado3.clear().sendKeys(value3);
		return this;
	}
	
}
