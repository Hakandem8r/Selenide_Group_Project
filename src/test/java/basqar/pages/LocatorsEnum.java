package basqar.pages;

public enum LocatorsEnum {
    url ( "https://test.basqar.techno.study/"),
    kullanici("daulet2030@gmail.com"),
    password("TechnoStudy123@");


    private String s;

    LocatorsEnum(String s) {

        this.s = s;
    }

    public String getStr(){
        return s;
    }
}
