Feature: Gmail compose and send mail feature

	@tag1
  Scenario: Test compose button
    Given User launches the browser
    When User opens the gmail login page
    Then User login to gmail with username "sampletestproject80@gmail.com"
    And password "testproject@80"
    And User clicks on the compose button
    Then Check the New Message box appears
    Then close the browser
    
    @tag2
    Scenario: Test send mail
    Given User launches the browser
    When User opens the gmail login page
    Then User login to gmail with username "sampletestproject80@gmail.com"
    And password "testproject@80"
    And User clicks on the compose button
    Then User composes mail with To "sampletestproject80@gmail.com" Subject "Incubyte" Body "Automation QA test for Incubyte"
    And clicks Send
    Then close the browser