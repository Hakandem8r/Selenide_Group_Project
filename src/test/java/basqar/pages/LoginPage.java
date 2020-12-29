package basqar.pages;

import org.testng.annotations.Test;
import static basqar.pages.Locators.*;
import static basqar.pages.LocatorsEnum.*;

public class LoginPage implements LocatorsBy {

    @Test
    public void login(){
        System.out.println(Locators.url);
        System.out.println(LocatorsEnum.url);
        System.out.println(PASSWORD);
        System.out.println(password.getSayi());
        System.out.println(password.getStr());
    }

}
