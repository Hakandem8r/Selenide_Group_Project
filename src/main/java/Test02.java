import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test02 {


    @Test
    public void test1(){
        String url = "https://test.basqar.techno.study/";
        String kullanici = "daulet2030@gmail.com";
        String sifre = "TechnoStudy123@";

        open(url);
        $("input[formcontrolname='username']")
                .shouldBe(Condition.appear)
                .setValue(kullanici);
        $("input[formcontrolname='password']")
                .setValue(sifre).pressEnter();


        if ($(By.partialLinkText("Got it")).isEnabled()){
            $(By.partialLinkText("Got it")).click();
        }

        clickOnMenuTo1("Setup", "Parameters", "Countries");
    }

    public void clickOnMenuTo1(String...linkTexts){
        String strXpath = "";
        for (int i=0; i<linkTexts.length; i++) {
            if (i==0)
                strXpath += "(//span[contains(text(),'" + linkTexts[i] + "')])[1]";
            else
                strXpath += "//span[contains(text(),'" + linkTexts[i] + "')][1]";
            By by = By.xpath(strXpath);

            $(by).scrollTo().shouldBe(Condition.visible).click();
            strXpath += "//ancestor::fuse-nav-vertical-collapsable";
        }
    }
}
