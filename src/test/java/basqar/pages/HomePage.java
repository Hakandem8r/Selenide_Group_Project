package basqar.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static basqar.pages.Locators.*;


public class HomePage implements LocatorsBy{

    /*
        HomePage
        ana sayfa gidilebilir
        login yapilabilir
     */

    public HomePage(){
        getPage();
        login();
    }

    public void getPage(){
        open(url);
    }

    public void login(){

        $(USERNAME).shouldBe(Condition.appear).setValue(kullanici);

        $(PASSWORD).setValue(sifre).pressEnter();

        if ($(GOTIT).isEnabled()){
            $(GOTIT).click();
        }

        $(USERBELL).shouldBe(Condition.exist);
    }

    public CountryPage gotoCountries(){
        System.out.println("coutry page gittim");
        return new CountryPage();
    }

    public CityPage gotoCities(){
        System.out.println("city page gittim");
        return new CityPage();
    }

}
