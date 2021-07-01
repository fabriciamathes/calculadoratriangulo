package common;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import enums.ByValue;

public class Element {

	private ByValue by;
	private String map;
	private WebElement webElement;
	private WebElement element = null;
	private HashMap<ByValue, By> byMap = new HashMap<>();

	public Element(ByValue by, String map) {
		this.by = by;
		this.map = map;
		setByMap();
	}

	private void setByMap() {
		byMap.put(ByValue.ID, By.id(map));
		byMap.put(ByValue.XPATH, By.xpath(map));
		byMap.put(ByValue.CSS, By.cssSelector(map));
		byMap.put(ByValue.LINKTEXT, By.linkText(map));
		byMap.put(ByValue.NAME, By.name(map));
		byMap.put(ByValue.TAGNAME, By.tagName(map));

	}

	public void setElement(WebElement webElement) {
		this.webElement = webElement;
	}

	public WebElement getElement() {
		if (element == null) {
			element = get(byMap.get(by));
		}
		return element;
	}

	public WebElement get(By by) {
		if (webElement == null) {
			return Driver.getDriver().findElement(by);
		}
		return webElement.findElement(by);
	}

	public List<WebElement> getElements() {
		return Driver.getDriver().findElements(byMap.get(by));
	}

	public void sendKeys(CharSequence... value) {
		getElement().sendKeys(value);
	}

	public String getText() {
		return getElement().getText();
	}

	public void click() {
		getElement().click();
	}

	// Pegar um atributo, exemplo: 'class=item'
	public String getAtributite(String value) {
		return getElement().getAttribute(value);
	}

	public Element clear() {
		getElement().clear();
		return this;
	}

	// verifica se o elemento est� habilitado ou n�o
	public boolean isEnabled() {
		return getElement().isEnabled();
	}

	// verifica se o elemento � exibido ou n�o, quando ele � invis�vel.
	public boolean isDisplayed() {
		return getElement().isDisplayed();
	}

	public void select(String value) {
		Select select = new Select(getElement());
		select.selectByVisibleText(value);
	}
	
	public void selectLista(String value) throws Exception {
		List<WebElement> listElement = getElements();
		boolean encontrou = false;
		for (WebElement webElement : listElement) {
			if (value.equals(webElement.getText().trim())) {
				webElement.click();
				encontrou = true;
				break;
			}
		}
		if (!encontrou) {
			throw new Exception("Valor "+value+" nao existe na lista, selector:"+map);
		}
	}
	
	public Element waitVisibleElement() {
		element = Driver.waitVisibleElement(byMap.get(by));
		return this;
	}
	
	public void waitInvisibilityElement() {
		Driver.waitInvisibilityElemnt(byMap.get(by));
	}
	
	public Element waitClickableElement() {
		element = Driver.waitClickableElement(byMap.get(by));
		return this;
	}
}
