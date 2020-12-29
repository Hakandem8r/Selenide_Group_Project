package basqar.pages;

import static com.codeborne.selenide.Selenide.*;
import org.testng.annotations.Test;
import static basqar.pages.LocatorsEnum.*;
import static basqar.pages.LocatorsEnum1.*;

public class LoginPage implements LocatorsBy {

    @Test
    public void login(){
        System.out.println(Locators.url);
        System.out.println(LocatorsEnum.url);
        System.out.println(PASSWORD);
        System.out.println(password.getStr());

        $(kullanici1.getSelector()).setValue(kullanici1.getValue());
    }

}
