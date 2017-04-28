package Pomoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by kamil on 12.04.17.
 */
public class CzekajNaElementPomoc {

    WebDriverWait wait;
    public void setWait(WebElement element, WebDriver driver){
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void setWaitVisible(int czas){
        try {
            Thread.sleep(czas);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

