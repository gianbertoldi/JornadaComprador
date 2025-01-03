package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	WebDriver driver;

	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By by, int espera) {
	    WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(espera)))
	            .until(ExpectedConditions.elementToBeClickable(by));
	    element.click();
	}

	public WebElement inputText(By by, String valor, int espera) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		WebElement element = driver.findElement(by);
		element.sendKeys(valor);
		return element;
	}
	
	public WebElement slowType(By by, String valor, int espera) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        WebElement element = driver.findElement(by);
        slowTypeInElement(element, valor);
        return element;
    }
	
	private void slowTypeInElement(WebElement element, String value) {
        Actions actions = new Actions(driver);
        for (char c : value.toCharArray()) {
            actions.sendKeys(element, String.valueOf(c)).build().perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

	public WebElement visibilidadeDoElemento(WebDriver driver, By by, int esperas) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(esperas));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public String getText(By by, int espera) {
		String texto = "";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		WebElement element = driver.findElement(by);
		texto = element.getText();
		return texto;
	}
	
	public boolean isButtonEnabled(By by, int espera) {
	    WebElement button = new WebDriverWait(driver, Duration.ofSeconds(espera))
	            .until(ExpectedConditions.presenceOfElementLocated(by));
	    return button.isEnabled();
	}
	
	public void tirarFocoDoElementoAtual() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.activeElement.blur();");
    }
}
