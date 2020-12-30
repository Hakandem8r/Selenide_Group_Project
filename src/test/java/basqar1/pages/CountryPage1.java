package basqar1.pages;

import basqar1.model.Locators1;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class CountryPage1 implements Locators1 {



    public void addCountry(String name, String code){
        $(FORM_NAME).setValue(name);
        $(FORM_CODE).setValue(code);
        $(FORM_SAVE_BUTTON).click();
    }




}
