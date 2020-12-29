package basqar.pages;

import org.testng.Assert;

public class CountryPage {

    public void gotoCountry(){
        System.out.println("goto Country");
    }

    public void addCountry(){
        System.out.println("Add Country");
        Assert.assertTrue(true);
    }

    public void deleteCountry(){
        System.out.println("Delete Country");
        Assert.assertTrue(true);
    }

    public void updateCountry(){
        System.out.println("Update Country");
        Assert.assertTrue(true);
    }

}
