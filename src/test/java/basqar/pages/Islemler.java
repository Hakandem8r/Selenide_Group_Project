package basqar.pages;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class Islemler {



    @Test
    public void Test01(){

        HomePage basqar = new HomePage();
        //basqar.getPage();
        //basqar.login();


/*
        CountryPage cp = new CountryPage();
        cp.gotoCountry();
        cp.addCountry();
        cp.updateCountry();
        cp.deleteCountry();
*/
        CountryPage cp = basqar.gotoCountries();
        cp.addCountry();
        cp.updateCountry();
        cp.deleteCountry();

        CityPage city = basqar.gotoCities();


        Selenide.sleep(5000);

    }



}
