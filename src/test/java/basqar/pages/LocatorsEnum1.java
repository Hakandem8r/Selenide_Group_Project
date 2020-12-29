package basqar.pages;

import org.openqa.selenium.By;

public enum LocatorsEnum1 {
    kullanici1(By.cssSelector("input[formcontrolname='username']"), "daulet2030@gmail.com"),
    password1(By.cssSelector("input[formcontrolname='password']"), "TechnoStudy123@");


    private By by;
    private String value;

    LocatorsEnum1(By by, String value) {
        this.by = by;
        this.value = value;
    }

    public By getSelector(){
        return by;
    }
    public String getValue(){
        return value;
    }
}
