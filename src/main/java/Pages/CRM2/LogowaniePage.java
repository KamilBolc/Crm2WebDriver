package Pages.CRM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 11.04.17.
 */
public class LogowaniePage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = ".//*[@id='login']")
    public WebElement Login;
    @FindBy(how = How.XPATH, using = ".//*[@id='password']")
    public WebElement Haslo;
    @FindBy(how = How.XPATH, using = ".//*[@id='login-box']/a/img")
    public WebElement Zaloguj;

    public LogowaniePage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    public LogowaniePage otworzUrl(String url){
        driver.get(url);
        return this;
    }

    public LogowaniePage wpiszHaslo(String haslo){
        Haslo.sendKeys(haslo);
        return this;
    }

    public LogowaniePage wpiszLogin(String login){
        Login.sendKeys(login);
        return this;
    }

    public LogowaniePage wcisnijZaloguj(){
        Zaloguj.click();
        return this;
    }

}
