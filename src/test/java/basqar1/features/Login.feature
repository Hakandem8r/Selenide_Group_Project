Feature: Login to basqar

  Scenario: Login
    Given user on homepage
    When  user login with user name as "daulet2030@gmail.com" and password as "TechnoStudy123@"
    Then  login should be successfull


  Scenario: Goto Countries
    Given on countries page
    When  user click to AddButton
    Then  dialog form should be visible



