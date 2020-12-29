package tutorial;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class _04_SelenideConditions {

    void conditionSamples(){
        //  Checks if element is visible
        $("input").shouldBe(Condition.visible);

        //  Check if element exist. It can be visible or hidden.
        $("input").should(Condition.exist);

        //  Checks that element is not visible or does not exists. Opposite to appear
        $("input").shouldBe(Condition.hidden);

        //  Synonym for visible - may be used for better readability
        $("#logoutLink").should(Condition.appear);

        //  Synonym for visible - may be used for better readability
        $("#logoutLink").waitUntil(Condition.appears, 10000);

        //  Synonym for hidden - may be used for better readability:
        $("#loginLink").waitUntil(Condition.disappears, 9000);

        //  Synonym for hidden - may be used for better readability:
        $("#loginLink").should(Condition.disappear);

        //  Check if element has "readonly" attribute (with any value)
        $("input").shouldBe(Condition.readonly);

        //  For input element, check that value is missing or empty
        $("#input").shouldBe(Condition.empty);

        //  For other elements, check that text is empty
        $("h2").shouldBe(Condition.empty);

        //  Check if image is loaded.
        $("#mydiv").should(Condition.image);

        //  Check if browser focus is currently in given element
        $("#mydiv").should(Condition.focused);

        //  Checks that element is not disabled,    WebElement.isEnabled()
        $("#mydiv").should(Condition.enabled);

        //  Checks that element is disabled,    WebElement.isEnabled()
        $("#mydiv").should(Condition.disabled);

        //  Checks that element is selected (inputs like drop-downs etc.),
        //  WebElement.isSelected()
        $("#mydiv").should(Condition.selected);

        //  Checks that checkbox is checked,    WebElement.isSelected()
        $("#mydiv").should(Condition.checked);

        //  Check if element has given attribute (with any value)
        $("#mydiv").shouldHave(Condition.attribute("fileId"));

        //  Check if element has given attribute (with any value)
        $("#mydiv").shouldHave(Condition.attribute("fileId", "12345"));

        //  Assert that given element's attribute matches given regular expression
        $("h1").should(Condition.attributeMatching("fileId", ".*12345.*"));

        //Assert that element contains given "value" attribute as substring
        // NB! Ignores difference in non-visible characters like spaces, non-breakable spaces, tabs, newlines etc.
        $("input").shouldHave(Condition.value("12345 666 77"));

        //  Check that element has given the property value of the pseudo-element
        $("input").shouldHave(Condition.pseudo(":first-letter", "color", "#ff0000"));

        //  Check that element has given the "content" property of the pseudo-element
        $("input").shouldHave(Condition.pseudo(":before", "Hello"));

        //
        $("#input").shouldHave(Condition.exactValue("John"));

        //  Asserts the name attribute of the element to be exact string
        $("#input").shouldHave(Condition.name("username"));

        //  Asserts the type attribute of the element to be exact string
        $("#input").shouldHave(Condition.type("checkbox"));

        //
        $("#input").shouldHave(Condition.id("myForm"));

        //  The same as matchText()
        $(".error_message").waitWhile(Condition.matchesText("Exception"), 12000);

        //  Assert that given element's text matches given regular expression
        $("h1").should(Condition.matchText("Hello\\s*John"));

        //  Assert that element contains given text as a substring.
        $("h1").shouldHave(Condition.text("Hello\\s*John"));

        //  Checks on a element that exactly given text is selected (=marked with mouse/keyboard)
        $("input").shouldHave(Condition.selectedText("Text"));

        //  Assert that element contains given text as a case sensitive substring
        $("h1").shouldHave(Condition.textCaseSensitive("Hello\\s*John"));

        //  Assert that element has exactly (case insensitive) given text
        $("h1").shouldHave(Condition.exactText("Hello"));

        //  Assert that element contains given text (without checking child elements).
        $("h1").shouldHave(Condition.ownText("Hello"));

        //  Assert that element has given text (without checking child elements).
        $("h1").shouldHave(Condition.exactOwnText("Hello"));

        //  Assert that element has exactly the given text
        $("h1").shouldHave(Condition.exactTextCaseSensitive("Hello"));

        //  Asserts that element has the given class. Element may other classes too.
        $("input").shouldHave(Condition.cssClass("active"));

        //  Checks if css property (style) applies for the element.
        //  Both explicit and computed properties are supported.
        //  Note that if css property is missing WebElement.getCssValue(java.lang.String)
        //  return empty string. In this case you should assert against empty string.
        //  <input style="font-size: 12">
        $("input").shouldHave(Condition.cssValue("font-size", "12"));
        $("input").shouldHave(Condition.cssValue("display", "block"));

        //  Checks if element matches the given predicate.
        $("input").should(Condition.match("empty value attribute", el -> el.getAttribute("value").isEmpty()));

    }
}
