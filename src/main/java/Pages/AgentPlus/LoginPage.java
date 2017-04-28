package Pages.AgentPlus;

import Pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 28.04.17.
 */
public class LoginPage extends CzekajNaElementPomoc{
    WebDriver driver;

    @FindBy(how = How.XPATH, using = ".//*[@id='inputlogin']")
    public WebElement Login;
    @FindBy(how = How.XPATH, using = ".//*[@id='inputpassword']")
    public WebElement Haslo;
    @FindBy(how = How.XPATH, using = "//button[contains(.,'Zaloguj')]")
    public WebElement Zaloguj;

    public LoginPage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage otworzUrl(String url){
        driver.get(url);
        return this;
    }

    public LoginPage wpiszHaslo(String haslo){
        Haslo.sendKeys(haslo);
        return this;
    }

    public LoginPage wpiszLogin(String login){
        Login.sendKeys(login);
        return this;
    }

    public LoginPage wcisnijZaloguj(){
        setWait(Zaloguj, driver);
        Zaloguj.click();
        return this;
    }
}
