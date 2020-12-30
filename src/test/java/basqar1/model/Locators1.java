package basqar1.model;

import org.openqa.selenium.By;

public interface Locators1 {

    String URL = "https://test.basqar.techno.study/";
    String KULLANICI = "daulet2030@gmail.com";
    String SIFRE = "TechnoStudy123@";
    By USERNAME = By.cssSelector("input[formcontrolname='username']");
    By PASSWORD = By.cssSelector("input[formcontrolname='password']");
    By GOTIT = By.partialLinkText("Got it");
    By USERBELL = By.cssSelector("user-message-bell");
    By SETUP1 = By.xpath("(//span[contains(text(),'Setup')])[1]");
    By PARAMETERS1 = By.xpath("(//span[contains(text(),'Parameters')])[1]");
    By COUNTRIES = By.xpath("//span[contains(text(),'Countries')]");
    By ADDBUTTON = By.tagName("ms-add-button");
    By DIALOGCONTAINER = By.cssSelector("mat-dialog-container");

}
