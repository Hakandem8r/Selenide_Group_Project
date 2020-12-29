package tutorial;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;

public class _03_Configuration {

    /*
        Selenide'nin browser konfigürasyonu
     */
    void configurationsSamples() {

        //  browser  (Default value: "chrome")
        //  (chrome | firefox | opera | ie | edge | legacy_firefox)
        Configuration.browser = "chrome";

        // baseUrl tanimlamis ise örnek : "http://www.goole.com/maps"  linki
        // open("/maps") olarak kullanilir
        Configuration.baseUrl = "http://www.goole.com";

        //  startMaximized     (true | false)
        Configuration.startMaximized = true;

        //  assertionMode  (AssertionMode.SOFT | AssertionMode.STRICT)
        Configuration.assertionMode = AssertionMode.SOFT;

        //  headless  (true | false)
        Configuration.headless = true;

        //  remote, to use Selenide Grid    Default value: null (Grid is not used).
        Configuration.remote = "http://localhost:5678/wd/hub";

        //  baseUrl     (Default value:   http://localhost:8080)
        Configuration.baseUrl = "https://demoqa.com";

        //  browserPosition      (10x10)
        Configuration.browserPosition = "10x10";

        //  browserSize (Default value:   1366x768)
        Configuration.browserSize = "500x500";

        //  timeout     (Default value: 4000)
        Configuration.timeout = 5000;

        //  pageLoadStrategy
        //  Possible values: "none", "normal" and "eager".  Default value: "normal".
        Configuration.pageLoadStrategy = "normal";

        //  clickViaJs (advise to use in IE)
        Configuration.clickViaJs = true;

        // holdBrowserOpen (Default value = false), test sonucunda browser acik kalsin mi
        Configuration.holdBrowserOpen = true;

    }
}
