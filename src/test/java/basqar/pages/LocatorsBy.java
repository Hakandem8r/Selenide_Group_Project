package basqar.pages;


import org.openqa.selenium.By;

public interface LocatorsBy {

    By USERNAME = By.cssSelector("input[formcontrolname='username']");
    By PASSWORD = By.cssSelector("input[formcontrolname='password']");
    By GOTIT = By.partialLinkText("Got it");

}
