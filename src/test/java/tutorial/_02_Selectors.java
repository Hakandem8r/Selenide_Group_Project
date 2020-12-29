package tutorial;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class _02_Selectors {

    //  $ icin gecerli olan selectörler, $$ icin de gecerlidir

    public void seleniumSelectors(){
        $(By.cssSelector("#input")).click();
        $(By.className("class")).click();
        $(By.id("id")).click();
        $(By.linkText("linkText")).click();
        $(By.name("name")).click();
        $(By.partialLinkText("PartialLinkText")).click();
        $(By.tagName("input")).click();
    }

    public void selenideSelectors(){

        $("#input").click();        // $    default text cssSelector'dür
        $x("xpath").click();    // $x   default text xPath'dir

        $(byCssSelector("#input")).click();
        $(by("type", "button")).click();
        $(by("type$", "button")).click();
        $(by("type^", "button")).click();
        $(byAttribute("type*", "button")).click();
        $(byAttribute("type$", "button")).click();
        $(byAttribute("type~", "button")).click();
        $(byClassName("class")).click();
        $(byId("id")).click();
        $(byLinkText("linkText")).click();
        $(byName("name")).click();
        $(byPartialLinkText("PartialLinkText")).click();
        $(byTagName("input")).click();
        $(byText("full text")).click();
        $(byTitle("title")).click();
        $(byValue("value")).click();
        $(byXpath("xpath")).click();
        $(withText("contained text")).click();  // icinde gecen text
    }
}
