package tutorial;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class _01_genelYapi {

    @Test
    public void genelYapi1(){
        /*  Selenidenin genel yapisi asagidaki gibidir.
            Static importlar yapilmalisir

            import static com.codeborne.selenide.Selenide.*;

            // driver tanimlamaya gerek yok. WebDriverRunner default olarak chrome alir.
            open(url);

            // $(selector) == driver.findElement(By.cssSelector(selector))
            $(selector).doAction();

            // assertion(condition)
            $(selector).check(condition);

            // $$(selector) == driver.findElements(By.cssSelector(selector))  , List
            ElementCollection collection = $$(selector);

         */

        String url = "http://opencart.abstracta.us/";
        open(url);      //== driver.get("http://opencart.abstracta.us/")

        String inputBox = "input[name='search']";
        By submitButton = By.cssSelector("button.btn.btn-default.btn-lg");
        By products = By.cssSelector("div.product-layout");

        $(inputBox).setValue("mac");    // string girilen cssSelector olmalidir
        $(submitButton).click();        // By classi ile selektör tipi belirlenebilir

        // products selectörü ile alinan tüm elementlerin sayisi 3 den büyük olmali
        $$(products).shouldBe(CollectionCondition.sizeGreaterThan(3));

        // ElementCollection List oldugundan loop ile gezilebilir
        // $ ile bulunan ve $$ icindeki elementler SelenideElement sinifindandir
        System.out.println("Bulunan Element Sayisi : " + $$(products).size());
        System.out.println("Bulunan Elementlerin Listesi : ");
        for (SelenideElement e: $$(products)){
            System.out.println("'mac' kelimesini iceriyor mu : " + e.getText().toLowerCase().contains("mac"));
            System.out.println("Element altindaki TÜM Textler:\n" + e.getText());
            System.out.println("Sadece Element'e ait Text:\n" + e.getOwnText());
            System.out.println("Element'in innerText'i:\n" + e.innerText());
            System.out.println("-----------------------------------------------");
        }
    }



}
