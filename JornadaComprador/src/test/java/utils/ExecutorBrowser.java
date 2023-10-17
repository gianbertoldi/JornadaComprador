package utils;

import org.openqa.selenium.WebDriver;

public class ExecutorBrowser {

	private WebDriver driver;
	BrowserDriverMananger browserMananger;
	
	public void setup() {	
		browserMananger = new BrowserDriverMananger();
		driver = BrowserDriverMananger.browser("edge");
		driver.get("https://ww4.banrisul.com.br/bvr/linkpagamento/TESTE/eoSjeWDQ3ijoeQ_a6xW6xJHN2bTCy5uidg9lBOq9aKopoHmxxQ");
	
	}
	
	public void exit() {
		driver.quit();
	}
}
